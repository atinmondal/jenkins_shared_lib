// def call(String projectName,String imageTag, String dockerHubUser){
//     sh """
//         docker rmi ${dockerHubUser}/${projectName}:${imageTag}
//         docker rmi ${dockerHubUser}/${projectName}:latest
//     """ 
// }

// Docker image cleanup for ECR

// def call(String aws_account_id,String region, String ecrRepositoryName){
//     sh """
//         docker rmi ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest
//     """ 
// }