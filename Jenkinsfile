pipeline {
    agent any

    stages('build') {
        steps {
            sh 'javac Main.java'
            sh 'java Main.class Jenkins'
        }
    }
}