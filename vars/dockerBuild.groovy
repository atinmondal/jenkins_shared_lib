def call(String aws_account_id,String region, String ecrRepositoryName){
    sh """
        docker build -t ${ecrRepositoryName} .
        docker tag ${ecrRepositoryName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepositoryName}:latest
    """
}