pipeline{
    agent any
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
