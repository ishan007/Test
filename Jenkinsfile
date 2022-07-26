pipeline {

    agent {
        docker {
            image 'openjdk:11'
        }
    }

    stages {
        stage('build') {
            steps {
                sh 'javac Main.java'
                sh 'java Main'
            }  
        }
    }

}