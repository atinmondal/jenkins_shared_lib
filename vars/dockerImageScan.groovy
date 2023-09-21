def call(String projectName,String imageTag, String dockerHubUser){
    sh """
        trivy image ${dockerHubUser}/${projectName}:latest > trivyScan.txt
        cat trivyScan.txt
    """ 
}