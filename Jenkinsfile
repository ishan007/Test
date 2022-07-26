pipeline {
    agent {
        docker {
            image 'openjdk:11'
        }
    }

    stages('build') {
        steps {
            sh 'docker run openjdk:11 javac Main.java'
            sh 'docker run openjdk:11 java Main.class Jenkins'
        }
    }
}