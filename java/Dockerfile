FROM tomcat:9-jdk11-openjdk-slim

WORKDIR /usr/local/tomcat/webapps

ADD ./target/hotel-1.0.0-SNAPSHOT ./ROOT

EXPOSE 8080

CMD [ "catalina.sh", "run" ]
