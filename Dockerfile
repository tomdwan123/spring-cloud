FROM openjdk:8-jdk-alpine

ADD ./target/library-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/library-service.jar"]

EXPOSE 8080