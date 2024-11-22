FROM eclipse-temurin:17
COPY target/jenkins.jar aws.jar
CMD ["java","-jar","aws.jar"]