FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/boucher-core-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]