import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class OmokGame extends JFrame {

    static final int SIZE = 15;
    static final int CELL = 40;
    static final int MARGIN = 40;

    int[][] board = new int[SIZE][SIZE]; // 0 empty, 1 black, 2 white
    Stack<Point> history = new Stack<>();
    Random random = new Random();

    BoardPanel boardPanel = new BoardPanel();

    public OmokGame() {
        setTitle("오목 게임 (플레이어 vs 랜덤 AI)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(boardPanel, BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);

        setSize(
                SIZE * CELL + MARGIN * 2,
                SIZE * CELL + MARGIN * 2 + 80
        );
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel createButtonPanel() {
        JPanel panel = new JPanel();

        JButton undoBtn = new JButton("⏪ Undo");
        JButton saveBtn = new JButton("💾 저장");
        JButton loadBtn = new JButton("📂 불러오기");

        undoBtn.addActionListener(e -> undo());
        saveBtn.addActionListener(e -> save());
        loadBtn.addActionListener(e -> load());

        panel.add(undoBtn);
        panel.add(saveBtn);
        panel.add(loadBtn);

        return panel;
    }

    void undo() {
        if (history.size() >= 2) {
            for (int i = 0; i < 2; i++) {
                Point p = history.pop();
                board[p.x][p.y] = 0;
            }
            repaint();
        }
    }

    void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("omok.save"))) {
            oos.writeObject(board);
            oos.writeObject(history);
            JOptionPane.showMessageDialog(this, "저장 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void load() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("omok.save"))) {
            board = (int[][]) ois.readObject();
            history = (Stack<Point>) ois.readObject();
            repaint();
            JOptionPane.showMessageDialog(this, "불러오기 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void aiMove() {
        ArrayList<Point> empty = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    empty.add(new Point(i, j));
                }
            }
        }

        if (empty.isEmpty()) return;

        Point p = empty.get(random.nextInt(empty.size()));
        board[p.x][p.y] = 2;
        history.push(p);
    }

    class BoardPanel extends JPanel {

        BoardPanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    // 🔥 핵심 수정 포인트
                    int col = Math.round((e.getX() - MARGIN) / (float) CELL);
                    int row = Math.round((e.getY() - MARGIN) / (float) CELL);

                    if (row < 0 || row >= SIZE || col < 0 || col >= SIZE)
                        return;

                    if (board[row][col] != 0) return;

                    // 검은돌 (플레이어)
                    board[row][col] = 1;
                    history.push(new Point(row, col));

                    // 흰돌 (AI)
                    aiMove();

                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 바둑판
            for (int i = 0; i < SIZE; i++) {
                g.drawLine(
                        MARGIN,
                        MARGIN + i * CELL,
                        MARGIN + (SIZE - 1) * CELL,
                        MARGIN + i * CELL
                );
                g.drawLine(
                        MARGIN + i * CELL,
                        MARGIN,
                        MARGIN + i * CELL,
                        MARGIN + (SIZE - 1) * CELL
                );
            }

            // 돌 그리기
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] != 0) {
                        g.setColor(board[i][j] == 1 ? Color.BLACK : Color.WHITE);
                        g.fillOval(
                                MARGIN + j * CELL - 15,
                                MARGIN + i * CELL - 15,
                                30,
                                30
                        );
                        g.setColor(Color.BLACK);
                        g.drawOval(
                                MARGIN + j * CELL - 15,
                                MARGIN + i * CELL - 15,
                                30,
                                30
                        );
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(OmokGame::new);
    }
}
