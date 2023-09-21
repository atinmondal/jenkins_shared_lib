// def call(String projectName,String imageTag, String dockerHubUser){
//     sh """
//         docker image build -t ${dockerHubUser}/${projectName} .
//         docker image tag ${dockerHubUser}/${projectName} ${dockerHubUser}/${projectName}:${imageTag}
//         docker image tag ${dockerHubUser}/${projectName} ${dockerHubUser}/${projectName}:latest
//     """ 
// }

// Docker Build for ECR
def call(String aws_account_id,String region, String ecrRepositoryName){
    sh """
        docker build -t ${ecrRepositoryName} .
        docker tag ${ecrRepositoryName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest
    """
}