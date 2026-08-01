# maven-shop

## 개발 환경

- Spring Boot 2.7.18
- Maven
- JDK 8
- JSP / JSTL
- Apache Tiles 

## 배포 환경
- WAR 방식으로 패키징
- 외장 Tomcat 서버에 배포
- 배포 파일명: `ROOT.war`

## CI/CD
- Jenkins 연동

## 추가 작업
- 로그인 기능 구현
  - 일반 로그인 -> Spring Security + Session
  - 카카오 로그인 -> OAuth + Session
  - Spring Security + JWT
- `logback-spring.xml` 설정 파일 적용
- Jasypt를 사용한 ``민감 설정값 암호화
- apache 1대 - tomcat 2대로 로드밸런싱
