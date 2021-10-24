#!groovy?
def GIT_COMMIT_SHORT = "

node {
deleteDir()
stage('Descargar Fuentes') {
checkout scm
script {
    GIT_COMMIT = sh (
        script: 'git rev-parse HEAD',
        returnStdout: true
    ).trim()
    GIT_COMMIT_SHORT = GIT_COMMIT.substring(0,8)
}
  
}
stage('Compilando con maven')
{	//Configuration / Global Tool COnfiguration / MAVEN jenkinsmvn ==> MAVEN_HOME = D:\Tools\apache-maven-3.6.0
def mvnHome = tool 'jenkinsmvn';
sh "${mvnHome}/bin/mvn clean package"
}
stage('Construyendo Docker ') {
script{
//bat "docker stop container-repobackend"
//bat "docker rm -f container-repobackend"
//bat "docker image rm -f repobackend"
//bat "docker rmi repobackend"
sh "docker build -t repobackend:${GIT_COMMIT_SHORT} ."
}
}
stage('Iniciando Docker ') {
script{
sh "docker run -d --name container-repobackend -p 8085:8085 repobackend:${GIT_COMMIT_SHORT}"
}
}
}
