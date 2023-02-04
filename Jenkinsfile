pipeline {

  agent any
  tools{
        maven 'maven3'
        jdk 'default'
    }
  stages {  
    stage("main") {      
      steps {
        echo 'build completed tiny service! successfully'
      }
    }
    stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/dznkos/tinyservice']]])
                sh 'mvn clean install'
            }
        }
    
    stage('build jar'){
      steps {
        echo 'here'
      }
    }
    
    
    stage('Build docker image'){
        steps{
            script{
                sh 'docker build -t debisun/devops-integration .'
            }
        }
    }
  }

}
