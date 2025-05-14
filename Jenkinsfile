 pipeline { 
    agent any 
    tools { 
          maven ' Maven' //Ensure name matches with configured  
    } 
    stages { 
        stage('Checkout') {  
            steps { 
                git branch: 'master', url: 'https://github.com/mtechkiran/SimpleCalci.git'  
            } 
    } 
     stage('Build') {  
            steps { 
                sh 'mvn clean package'  
            } 
      } 
     stage('Test') {  
            steps { 
                sh 'mvn test'  
            } 
      } 
     stage('Run Application') {  
            steps { 
                sh 'java –jar target/SimpleCalci-0.0.1-SNAPSHOT.jar'  
            } 
      } 
    } 
}
