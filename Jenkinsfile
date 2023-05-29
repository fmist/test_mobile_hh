pipeline {
agent any

stages {
    stage('test') {
    steps {
         echo 'asd'
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
                results : [[path: 'test_mobile_hh/build/allure-results']]
        ])
        }
    }
}
}