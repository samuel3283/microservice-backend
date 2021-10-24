FROM java:8
MAINTAINER samuel3283@gmail.com
ADD ./target/microservice-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","app.jar"]
