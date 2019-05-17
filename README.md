"# microservice-backend" 

http://localhost:8089/microservice/rest/service/user/list

docker build -t repobackend .

docker run -d --name container-repobackend -p 8089:8089 repobackend
