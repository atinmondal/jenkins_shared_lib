def call(credentialsId, String projectName,String imageTag, String dockerHubUser){
    withDockerRegistry(credentialsId: credentialsId, toolName: 'docker'){ 
    sh """
        docker push ${dockerHubUser}/${projectName}:${imageTag}
        docker push ${dockerHubUser}/${projectName}:latest
    """ 
    }
}