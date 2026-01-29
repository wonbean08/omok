
#### 프로젝트명: 오목게임
#### 개발자: 조원빈  

---

## 목차
- [프로젝트 소개](#프로젝트-소개)
- [프로젝트 설계](#프로젝트-설계)
- [기술 스펙](#기술-스펙)
- [주요 기능](#주요-기능)
- [실행 방법](#실행-방법)
- [폴더 구조](#폴더-구조)
- [오목 게임 시연](#오목 게임-시연)a

---

## 프로젝트 소개
1학년 첫 프로젝트로 자바 - Swing을 이용하여 온라인 오목게임을 구헌하였습니다.

---

## 프로젝트 설계
오목게임 (개인 프로젝트)
1. 요구사항 명세서
   
<img width="500" height="1024" alt="요구사항명세서" src="https://github.com/user-attachments/assets/4678ed68-5b21-4dc0-a938-024846f8663b" />


2. 화면 정의서 (Wireframe / 화면설계서)

<img width="150" alt="스크린샷 2026-01-29 173521" src="https://github.com/user-attachments/assets/fb7b3eaa-828e-4886-a04b-35603dfc90d7" />   <img width="150" alt="스크린샷 2026-01-29 173548" src="https://github.com/user-attachments/assets/8c50ba51-dbb7-4c65-b985-4fe93b9393a8" />   <img width="150" alt="스크린샷 2026-01-29 173603" src="https://github.com/user-attachments/assets/31e76c98-e1cd-4b14-a28a-0639fc6b4bed" />


3. (UML) 유스케이스 다이어그램 - Usecase Diagram 

<img width="370" height="253" alt="유즈케이스" src="https://github.com/user-attachments/assets/41a60ad7-089a-47be-8af3-ca87f8116d73" />


4. (UML) 시퀀스 다이어그램 - Sequence Diagram 

<img width="217" height="315" alt="시퀀스" src="https://github.com/user-attachments/assets/1c35508c-c1dd-450c-884e-5e68df614222" />


5. (UML) 클래스 다이어그램 - Class Diagram 

<img width="213" height="318" alt="클래스다이어그램" src="https://github.com/user-attachments/assets/e5b55a8b-182b-44d1-8a18-eeea7ee204ca" />


## 기술 스펙

| Category       | Tech     | Usage      | Badge                                                                                                                       |
| -------------- | -------- | ---------- | --------------------------------------------------------------------------------------------------------------------------- |
| Language       | Java     | Java SE 21 | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white)                  |
| UI Framework   | Swing    | GUI 구성     | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white)                      |
| Graphics       | AWT      | 도형 및 좌표 처리 | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white)                    |
| Data Structure | Stack    | 수순 관리      | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white) |
| Persistence    | Java I/O | 파일 저장/불러오기 | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white)       |
| AI Logic       | Random   | 랜덤 수 생성    | ![Java 21](https://img.shields.io/badge/Java-21-007396?style=for-the-badge\&logo=openjdk\&logoColor=white)                       |


---

## 주요 기능
### 1) 돌 놓기
- 사용자가 클릭한 위치의 좌표에 검은 돌을 놓고 랜덤한 좌표에 흰색 돌을 놓는다

<img width="200" alt="스크린샷 2026-01-29 173521" src="https://github.com/user-attachments/assets/b19ee556-8e04-4580-8099-8795382d1dae" />


### 2) 무르기(Undo)
- 버튼 클릭 시 이전 턴 상태로 돌아간다

<img width="200" alt="스크린샷 2026-01-29 180921" src="https://github.com/user-attachments/assets/3a859dff-90a1-44a3-ae3d-7d030b5d3472" />   <img width="200" alt="스크린샷 2026-01-29 180933" src="https://github.com/user-attachments/assets/909df03d-47ab-427c-b360-756083c0536a" />



### 3) 저장(Save)
- 버튼 클릭 시 해당 턴의 정보가 저장된다

<img width="200" alt="스크린샷 2026-01-29 181023" src="https://github.com/user-attachments/assets/ef081cc7-b19e-4133-a4b7-3878e5f64521" />


### 4) 불러오기(Load)
- 마지막으로 저장했을 때의 게임 정보를 불러온다

<img width="200" alt="스크린샷 2026-01-29 181051" src="https://github.com/user-attachments/assets/5f1b9ee9-d88a-4981-aa31-1dbc37c307a7" />   <img width="200" alt="스크린샷 2026-01-29 181102" src="https://github.com/user-attachments/assets/9f59da1a-bed6-4b74-8e54-ce7918a1951b" />



---




## 실행 방법

```bash
# Java 21 이상 설치 확인
java -version

# 소스 파일 컴파일
javac OmokGame.java

# 게임 실행
java OmokGame

```
---


## 오목 게임 시연


https://github.com/user-attachments/assets/11e08d8b-5d74-4e24-a142-0c930ff418b2




