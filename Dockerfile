FROM openjdk:8
EXPOSE 2255
ADD target/spring-jenkins-dockerone.jar spring-jenkins-dockerone.jar
ENTRYPOINT ["java","-jar","/spring-jenkins-dockerone.jar"]