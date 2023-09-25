def call(String aws_account_id,String region, String ecrRepositoryName){
    sh """
        trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest > trivyScan.txt
        cat trivyScan.txt
    """ 
}