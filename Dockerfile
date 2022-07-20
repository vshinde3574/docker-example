FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/docker-spring-boot.jar"]
