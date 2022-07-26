pipeline {
    agent {
        docker {
            image 'docker pull openjdk'
        }
    }

    stages('build') {
        steps {
            sh 'javac Main.java'
            sh 'java Main.class Jenkins'
        }
    }
}