pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Getting source code from GitHub...'
                checkout scm
            }
        }

        stage('Check Environment') {
            steps {
                sh 'echo JAVA_HOME=$JAVA_HOME'
                sh 'which java || true'
                sh 'java -version || true'
                sh 'which mvn || true'
                sh 'mvn -version || true'
            }
        }

        stage('Clean') {
            steps {
                echo 'Cleaning old build files...'
                sh 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling source code...'
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating jar file...'
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                echo 'Archiving jar...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully'
        }
        failure {
            echo 'Pipeline failed'
        }
        always {
            echo 'Pipeline execution finished'
        }
    }
}