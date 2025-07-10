#Start with a base image containing Java runtime
FROM amazoncorretto:17-alpine-jdk

#Information around who maintains the image
LABEL "website.name"="livemilton.com"

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]

