pipeline{
    agent 
     docker {
        image 'maven:3.8.1-adoptopenjdk-11' 
        args '-v /root/.m2:/root/.m2' 
     }
  stages {
    stage("build"){
      steps{
          echo 'starting build for application'
          docker.build("Dockerfile")
      }
    }
    stage("test"){
      steps{
          echo 'running unit tests'
      }
    }
    stage("deploy"){
      steps{
          echo 'starting deployment'
      }
    }
  }
}
node {
}
