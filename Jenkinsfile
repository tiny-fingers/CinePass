pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh './gradlew build'
            }
        }
        stage('test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}