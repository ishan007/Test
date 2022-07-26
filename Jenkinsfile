pipeline {
    agent {
        docker {
            image 'maven:3.8.4-openjdk-11-slim'
        }
    }

    stages('build') {
        steps {
            sh 'mvn --version'
        }
    }
}