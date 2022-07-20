FROM openjdk:8
COPY ./target/*.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/docker-spring-boot.jar"]
