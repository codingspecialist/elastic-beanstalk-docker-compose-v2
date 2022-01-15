# elastic-beanstalk-docker-compose-v2 로 배포하기

### Github과 GithubAction 으로 zip 파일 배포하기
- Docker 아마존 리눅스2 환경 생성 (해당환경에서는 Dockerrun.aws.json 사용안함. docker-compose 지원함)
- Dockerfile 생성
- docker-compose.yml 생성
- 포트 80:8080 포워딩 하기
- 로컬에서 빌드하기
```gradle
  ./gradlew clean build
```
- github에 푸시하기
- deploy.yml 에서 푸시된 자바 코드 빌드한 뒤 deploy 폴더에 Dockerfile, docker-compose.yml app.jar 파일 묶어서 
- zip파일로 생성하기
- 해당 zip 파일 최종적으로 엘라스틱 빈스톡에 던진다.