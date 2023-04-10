# 1. 아이템 선정

---
CRUD 기능을 가진 게시판을 구현한 프로젝트 입니다. 


# 2. 개요 
- 프로젝트 명칭 : Java Cafe 
- 개발 인원 : 1명 
- 개발 기간 : 2023.03.13 ~ 2023.03.31
- 주요 기능 : 
  - 게시판 - CRUD 기능
  - 사용자 - 회원가입 및 로그인
  - 댓글 - CRUD 기능
- 개발 언어 : Java 11
- 개발 환경 : SpringBoot, gradle 
- 데이터베이스 : MySQL
- 배포 : AWS EC2 

---
# 3. 서비스 미리보기 
### 3-1 게시글

1. 게시글 전체 목록
   <img width="1490" alt="스크린샷 2023-04-10 오후 12 09 13" src="https://user-images.githubusercontent.com/115435784/230817684-6137d4d7-06d3-489a-9e95-e38c0c61f834.png">

게시글의 전체 목록과 게시글의 댓글 개수가 조회됩니다. 

2. 게시글 등록

<img width="1492" alt="스크린샷 2023-04-10 오후 12 10 06" src="https://user-images.githubusercontent.com/115435784/230817801-318e9d45-c50e-45e1-a653-70c702cddc72.png">

작성자는 로그인 유저로 고정되고, 제목과 내용을 입력하도록 합니다.
게시글 작성 시, 게시글 목록으로 redirect 됩니다. 

<img width="1490" alt="스크린샷 2023-04-10 오후 12 10 54" src="https://user-images.githubusercontent.com/115435784/230817905-6cc37486-f3fb-43c2-bbca-7ddce40ee248.png">

유효하지 않은 데이터를 입력 시 에러 메시지를 출력합니다. 

3. 게시글 상세 보기
   <img width="1478" alt="스크린샷 2023-04-10 오후 12 12 41" src="https://user-images.githubusercontent.com/115435784/230818089-03dcddff-d8e2-4800-9451-e1bef12a074d.png">
게시글의 내용과 댓글을 확인할 수 있습니다.  


4. 게시글 수정하기
   <img width="1490" alt="스크린샷 2023-04-10 오후 12 13 40" src="https://user-images.githubusercontent.com/115435784/230818248-36007c3a-cddb-4845-9c40-31c5b9cbebb2.png">
글 작성자만 게시글을 수정할 수 있습니다.  
글 수정 후 게시글 상세 보기로 redirect 합니다.  

<img width="1485" alt="스크린샷 2023-04-10 오후 12 15 06" src="https://user-images.githubusercontent.com/115435784/230818346-3e3dec49-1b4c-4faf-abe5-b1a939031298.png">
유효하지 않은 데이터 입력 시 에러 메시지를 출력합니다.   
  
5. 게시글 삭제하기 
게시글에 다른 사용자의 댓글이 없을 경우 게시글을 삭제할 수 있습니다.  
게시글 삭제 성공 시, 게시글 목록으로 redirect 됩니다. 

### 3-2 회원 
1. 회원가입
   <img width="1492" alt="스크린샷 2023-04-10 오후 12 17 06" src="https://user-images.githubusercontent.com/115435784/230818606-4480fefe-92ce-4d4d-98d6-bda7d468c72a.png">
사용자 아이디, 비밀번호, 이름, 이메일을 입력 후 회원가입 합니다.

<img width="1488" alt="스크린샷 2023-04-10 오후 12 18 05" src="https://user-images.githubusercontent.com/115435784/230818703-3229ac0b-b756-4fb5-9abc-12fad9387326.png">
  
유효하지 않은 데이터 입력 시 에러 메시지를 출력합니다. 
비밀번호는 특수문자를 입력해야 합니다.
이메일은 이메일 형식에 맞춰 회원가입을 진행해야 합니다. 

2. 로그인
   <img width="1493" alt="스크린샷 2023-04-10 오후 12 19 14" src="https://user-images.githubusercontent.com/115435784/230818804-50c097b8-432c-4cf5-bf82-7ade64b4898f.png">
  
올바른 사용자 아이디, 비밀번호를 입력해서 회원가입 합니다. 

<img width="1488" alt="스크린샷 2023-04-10 오후 12 20 14" src="https://user-images.githubusercontent.com/115435784/230818896-5d649bbc-f4e7-452e-9c05-0730f0d67dbd.png">
공백을 입력 시 에러 메시지를 출력합니다.  

<img width="1490" alt="스크린샷 2023-04-10 오후 12 20 34" src="https://user-images.githubusercontent.com/115435784/230818951-9749f3a2-e65f-4941-aafb-0fbf061492cb.png">
회원이 아닌 아이디를 입력 시 에러 메시지를 출력합니다.  

<img width="1494" alt="스크린샷 2023-04-10 오후 12 21 26" src="https://user-images.githubusercontent.com/115435784/230819052-03696332-4e91-4db2-830b-2f7575d39e88.png">
잘못된 비밀번호를 입력 시 에러 메시지를 출력합니다.  

3. 회원 정보 수정  
   <img width="1492" alt="스크린샷 2023-04-10 오후 12 22 08" src="https://user-images.githubusercontent.com/115435784/230819120-63df81cf-93b4-471f-9133-0d2a79ce617a.png">
  
올바른 비밀번호를 입력 시, 이름과 이메일을 변경할 수 있습니다.     

<img width="1487" alt="스크린샷 2023-04-10 오후 12 22 48" src="https://user-images.githubusercontent.com/115435784/230819204-5671e2b3-19a7-416f-977c-26351fc9235d.png">
잘못된 비밀번호를 입력 시 에러 메시지를 출력합니다. 

<img width="1494" alt="스크린샷 2023-04-10 오후 12 23 35" src="https://user-images.githubusercontent.com/115435784/230819279-770fa644-2b9f-4f94-9fa0-c18c94150e47.png">
공백 입력 시 에러 메시지를 출력합니다.   

<img width="1493" alt="스크린샷 2023-04-10 오후 12 24 07" src="https://user-images.githubusercontent.com/115435784/230819326-84433e2d-c202-460c-809d-9466f3ae2696.png">
이메일 형식을 맞추지 않을 시 에러 메시지를 출력합니다. 
  
### 3-3 댓글 
<img width="1468" alt="스크린샷 2023-04-10 오후 12 25 28" src="https://user-images.githubusercontent.com/115435784/230819459-a1d89de9-9a1b-4924-a68c-4739f82370f7.png">

댓글은 ajax를 통해 비동기로 새로고침 없이 작성됩니다. 

### 3-4 기타 예외 처리
1. 글 작성자만 게시글 삭제 가능 
<img width="1492" alt="스크린샷 2023-04-10 오후 12 26 18" src="https://user-images.githubusercontent.com/115435784/230819539-ffa4b9da-99fb-4bf6-84d0-4be21df88513.png">

2. 글 작성자만 게시글 수정 가능
   <img width="1490" alt="스크린샷 2023-04-10 오후 12 26 58" src="https://user-images.githubusercontent.com/115435784/230819603-c3c5eb1c-f0b2-4671-a1d7-8235e51d41bd.png">

3. 댓글 작성자만 댓글 삭제 가능
   <img width="1489" alt="스크린샷 2023-04-10 오후 12 27 28" src="https://user-images.githubusercontent.com/115435784/230819660-baa5602e-25e4-445c-909c-dd6c0ad5c7e0.png">
    
4. 올바르지 못한 경로로 이동 시 에러 표시
   <img width="1486" alt="스크린샷 2023-04-10 오후 12 29 11" src="https://user-images.githubusercontent.com/115435784/230819846-7b9457be-95ae-42ea-91aa-66e1a53ef433.png">


# 4. 설계   
### 4-1 DB 설계 
Users 테이블    

| 필드 | 타입 | Null 허용 | 키 | 기본값 |  
|:---:|:---:|:---:|:---:|:---:|  
| USERID | VARCHAR (64) | NO | PRI | NULL |
| PASSWORD | VARCHAR (64) | NO | | NULL |
| NAME | VARCHAR (64) | NO | | NULL |
| EMAIL | VARCHAR (64) | NO | | NULL |

  
Articles 테이블    

|    필드     |      타입       | Null 허용 | 키 | 기본값 |  
|:---------:|:-------------:|:---:|:---:|:---:|  
|    ID     |      INT      | NO | PRI | NULL |
|  USERID   | VARCHAR (64)  | NO | | NULL |
|   TITLE   | VARCHAR (64)  | NO | | NULL |
| CONTENTS  | VARCHAR (300) | NO | | NULL |
| TIMESTAMP |   TIMESTAMP   | NO | | NULL |
|  DELETED  |    BOOLEAN    | NO | | NULL |


Replies 테이블   

|    필드     |      타입      | Null 허용 | 키 | 기본값 |  
|:---------:|:------------:|:---:|:---:|:---:|  
|    ID     |     INT      | NO | PRI | NULL |
| ARTICLEID | VARCHAR (64) | NO | | NULL |
|  USERID   | VARCHAR (64) | NO | | NULL |
| CONTENTS  | VARCHAR (64) | NO | | NULL |
| TIMESTAMP |   TIMESTAMP   | NO | | NULL |
|  DELETED  |    BOOLEAN    | NO | | NULL |


### 4-2 URL 설계  
|      URL      | method |      기능      |  
|:-------------:| :---: |:------------:|
| /users/login  | get |  로그인 페이지 요청  | 
| /users/login | post |    로그인 요청    | 
| /users/form | get | 회원 가입 페이지 요청 |  
| /users/create | post |   회원 가입 요청   |
| /users/{userId} | get | 회원 프로필 페이지 요청 | 
| /users/updateUser/{userId} | get | 회원 프로필 설정 페이지 요청 | 
| /users/updateUser/{userId} | put | 회원 프로필 설정 요청 | 
| /users/list | get | 모든 회원 멤버 페이지 요청 | 





















