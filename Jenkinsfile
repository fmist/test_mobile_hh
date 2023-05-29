pipeline {
agent any

stages {
    stage('test') {
    steps {
         sh './gradlew cucumber'
        }
    }
}
post {
    always {
        script {
        allure([
                commandLine : '2.13.0',
                includeProperties: false,
                jdk : 'openjdk-11',
                properties : [],
                reportBuildPolicy: 'ALWAYS',
                results : [[path: 'build/allure-results']
        ])
        }
    }
}
}