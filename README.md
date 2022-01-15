# elastic-beanstalk docker-compose.yml 로 배포하기

### Github과 GithubAction 없이 수동 배포해보기
- Docker 아마존 리눅스2 환경 생성 (해당환경에서는 Dockerrun.aws.json 사용안함. docker-compose 지원함)
- Dockerfile 생성
- docker-compose.yml 생성
- 포트 80:8080 포워딩 하기
- 로컬에서 빌드하기
```gradle
  ./gradlew clean build
```
- 직접 파일 업로드하기
- 업로드시 zip 파일로 압축해서 보내면 되는데..
- 폴더를 zip파일로 하면 폴더안에 폴더 나오기 때문에 꼭 파일들을 zip으로 압축하자.