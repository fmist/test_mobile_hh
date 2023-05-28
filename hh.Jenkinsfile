pipeline {
agent any

stages {
    stage('test') {
    steps {
         sh 'gradle cucumber'
        }
    }
}
post {
    always {
        allure includeProperties: false, jdk: '', results: [[path: 'build/allure-results']]
    }
}
}