pipeline{
    agent any
  stages {
    stage("build"){
      steps{
          echo 'starting build for application'
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
