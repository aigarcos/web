FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY crudApiRest.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080