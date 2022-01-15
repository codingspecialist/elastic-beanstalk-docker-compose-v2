FROM openjdk:11

WORKDIR /app
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profile.active=prod", "-jar", "app.jar"]