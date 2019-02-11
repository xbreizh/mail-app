FROM java:8-jdk-alpine

COPY ./target/mail_app-1.0-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch mail_app-1.0-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","mail_app-1.0-SNAPSHOT.jar"]