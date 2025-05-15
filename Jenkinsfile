pipeline { 
    agent any 

    tools { 
        maven 'Maven' // Ensure this matches the Maven tool name configured in Jenkins
    } 

    stages { 
        stage('Checkout') {  
            steps { 
                git branch: 'master', url: 'https://github.com/RakeshAM10/SimpleCalci.git'  
            } 
        } 

        stage('Build') {  
            steps { 
                bat 'mvn clean package'  
            } 
        } 

        stage('Test') {  
            steps { 
                bat 'mvn test'  
            } 
        } 

        stage('Run Application') {  
            steps { 
                bat 'java -jar target/SimpleCalci-0.0.1-SNAPSHOT.jar'  
            } 
        } 
    } 
}
