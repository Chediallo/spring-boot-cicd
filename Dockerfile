FROM  openjdk:21
EXPOSE 8080
WORKDIR /app
ADD target/spring-boot-cicd-image.jar spring-boot-cicd-image.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-cicd-image.jar"]
