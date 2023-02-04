pipeline {

  agent any
   
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
        sh '.\mvnw clean package'
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
