FROM java:8

WORKDIR /

COPY ./mail-business/target/mail-business-1.0-SNAPSHOT.jar mail-business-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD java - jar HelloWorld.jar