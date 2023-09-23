// def call(credentialsId, String projectName,String imageTag, String dockerHubUser){
//     withDockerRegistry(credentialsId: credentialsId, toolName: 'docker'){ 
//     sh """
//         docker push ${dockerHubUser}/${projectName}:${imageTag}
//         docker push ${dockerHubUser}/${projectName}:latest
//     """ 
//     }
// }

Docker push to ECR
def call(String aws_account_id,String region, String ecrRepositoryName){
    sh """
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
        docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest
    """
}