FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]