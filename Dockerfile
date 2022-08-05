FROM openjdk:11
#COPY build/libs/*SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#COPY gradlew .
#COPY gradle gradle
#COPY build.gradle.kts .
#COPY settings.gradle.kts .
#COPY src src
#RUN chmod +x ./gradlew # gradlew 실행권한 부여
#RUN ./gradlew bootJar # gradlew를 사용하여 실행 가능한 jar 파일 생성
#
#FROM openjdk:11
#COPY --from=builder build/libs/*.jar app.jar
#
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]