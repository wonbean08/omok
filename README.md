
#### 프로젝트명: 오목게임
#### 개발자: 조원빈  

---

## 목차
- [프로젝트 소개](#프로젝트-소개)
- [프로젝트 설계](#프로젝트-설계)
- [기술 스펙](#기술-스펙)
- [주요 기능](#주요-기능)
- [시스템 아키텍처](#시스템-아키텍처)
- [API 문서](#api-문서)
- [실행 방법](#실행-방법)
- [폴더 구조](#폴더-구조)
- [Advanced CI CD Pipeline](#advanced-ci-cd-pipeline)
- [LIMITREE 시연](#limitree-시연)a

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

## 시스템 아키텍처
```text
[React (Frontend)]
        |
        |  Axios (REST API)
        v
[Spring Boot (Backend)]
        |
        |  JPA (Repository)
        v
[Oracle DB]
```
<img width="500" height="1024" alt="아키텍처" src="https://github.com/user-attachments/assets/33e6a9dc-e7e2-4a0d-8789-d9d1946135b4" />

---


## 실행 방법

### 1) Backend (Spring Boot)
```bash
# Java 21 이상 설치 확인
java -version

# 소스 파일 컴파일
javac OmokGame.java

# 게임 실행
java OmokGame

```
---

## 폴더 구조
```text
team_project_Limitree/
  ├─ backend/          # Spring Boot (REST API)
  └─ frontend/         # React (UI/UX)
```
---
## Advanced CI CD Pipeline

<img width="1536" height="1024" alt="PI" src="https://github.com/user-attachments/assets/04e8ff4d-a72a-4fae-8953-b6794c976824" />

### Pipeline Description
1. 개발자가 기능 구현 후 GitHub에 Push
2. GitHub Actions를 통해 CI 파이프라인 자동 실행
3. Backend(Spring Boot)는 Gradle 기반 빌드 및 테스트 수행
4. Frontend(React/Next.js)는 빌드 후 정적 리소스 생성
5. 각 서비스별 Docker Image 생성
6. Docker Registry로 이미지 Push
7. 운영 서버에서 최신 이미지 Pull 후 배포
8. Backend는 Oracle DB와 연동되어 서비스 제공

본 프로젝트는 GitHub Actions 기반 CI/CD 파이프라인을 구축하여
코드 변경 시 자동 빌드, 테스트, Docker 이미지 생성 및 배포가
이루어지도록 구성하였습니다.

## LIMITREE 시연
https://github.com/user-attachments/assets/a095d075-e0a3-43f2-9e69-42faf59850e7

## LIMITREE 프레젠테이션
- [발표자료 보기](_260122.LIMITREE._REV1.pdf)


