FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app2.jar
ENTRYPOINT ["java","-jar","/app2.jar"]