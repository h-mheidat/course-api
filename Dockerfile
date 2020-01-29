FROM maven:3.3-jdk-8-alpine
WORKDIR /usr/app
EXPOSE 8080
ADD ./ ./
RUN mvn package
CMD ["java", "-jar", "target/course-api-0.0.1-SNAPSHOT.jar"]