"# microservice-backend" 

https://github.com/samuel3283/microservice-backend.git

http://localhost:8089/microservice/rest/service/user/list

docker build -t repobackend .

docker run -d --name container-repobackend -p 8089:8089 repobackend




docker stop container-repobackend
docker rm container-repobackend
docker rmi repobackend


Build when a change is pushed to BitBucket
Ejecutar periódicamente	
*/1 * * * *

