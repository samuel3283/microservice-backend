FROM java:8
MAINTAINER samuel3283@gmail.com
ADD microservice-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","app.jar"]
