def call(String projectName,String imageTag, String dockerHubUser){
    sh """
        docker rmi ${dockerHubUser}/${projectName}:${imageTag}
        docker rmi ${dockerHubUser}/${projectName}:latest
    """ 
}