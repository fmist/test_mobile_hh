pipeline {
agent any

stages {
    stage('test') {
    steps {
         sh './gradlew clean cucumber'
        }
    }
}
post {
    always {
        script {
        allure([
                commandline : '2.13.0',
                includeProperties: false,
                jdk : 'openjdk-11',
                properties : [],
                reportBuildPolicy: 'ALWAYS',
                results : [[path: 'build/allure-results']]
        ])
        }
        cleanWs()
    }
}
}