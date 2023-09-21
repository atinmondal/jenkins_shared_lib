def call(String projectName,String imageTag, String dockerHubUser){
    sh """
        docker image build -t ${dockerHubUser}/${projectName} .
        docker image tag ${dockerHubUser}/${projectName} ${dockerHubUser}/${projectName}:${imageTag}
        docker image tag ${dockerHubUser}/${projectName} ${dockerHubUser}/${projectName}:latest
    """ 
}