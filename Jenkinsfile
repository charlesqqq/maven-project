pipeline {
    agent any
    tools {
        maven 'local maven'
    }
    stages{
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo '開始存檔...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('Deploy to staging') {
            steps {
                build job: 'deploy-to-staging'
            }
        }
        stage('Deploy to production') {
            steps {
                timeout(time: 5, unit: 'DAYS') {
                    input message: 'Deploy to production?'
                }
                build job: 'deploy-to-production'
            }
            post {
                success {
                    echo 'success'
                }
                failure {
                    echo 'failure'
                }
            }
        }
    }
}
