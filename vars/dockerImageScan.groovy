// def call(String projectName,String imageTag, String dockerHubUser){
//     sh """
//         trivy image ${dockerHubUser}/${projectName}:latest > trivyScan.txt
//         cat trivyScan.txt
//     """ 
// }

Docker image scan for ECR image
def call(String aws_account_id,String region, String ecrRepositoryName){
    sh """
        trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest > trivyScan.txt
        cat trivyScan.txt
    """ 
}