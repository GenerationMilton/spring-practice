#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim
#Information aroung who maintains the image
MAINTAINER livemilton.com
#add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar java -jar .\target\accounts-0.0.1-SNAPSHOT.jar
#execute the application
ENTRYPOINT ["java", "-jar", "java -jar .\target\accounts-0.0.1-SNAPSHOT.jar"]

