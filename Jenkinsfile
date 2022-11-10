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
          echo 'starting unit tests'
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
