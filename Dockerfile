# user jdk 17 as base image
FROM openjdk:17-jdk-slim

#set working directory in container
WORKDIR /app

#copy jar from local to container
COPY target/migration-service-docker.jar migration-service.jar

#expose the port of localmachine
EXPOSE 8081

#Run the application
ENTRYPOINT ["java", "-jar", "migration-service.jar"]
