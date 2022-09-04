#Get the jdk image from dockerhub using FROM command

FROM openjdk:8-jdk-alpine

#make port available to the world outside to this container

EXPOSE 2025

#COPY all the files from source to destination

COPY target/cardverify-service-1.0-SNAPSHOT.jar cardverify-service-1.0-SNAPSHOT.jar

#Run the Application

ENTRYPOINT ["java","-jar", "/cardverify-service-1.0-SNAPSHOT.jar"]
