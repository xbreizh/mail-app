FROM tomcat:9.0.14-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./mail-business/target/mail-business-1.0-SNAPSHOT.jar /usr/local/tomcat/webapps/mail-business-1.0-SNAPSHOT.jar
CMD ["catalina.sh","run"]