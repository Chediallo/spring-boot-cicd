FROM  openjdk:21
EXPOSE 8080
ADD target/spring-boot-cicd-image.jar spring-boot-cicd-image.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-cicd-image.jar"]
