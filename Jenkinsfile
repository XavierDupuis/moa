// test CI 1

pipeline {
    agent any


    tools {
        maven "m3"
        jdk "jdk11"
    }


    stages {
        stage('Build') {
            steps {
                git 'https://github.com/XavierDupuis/moa.git'
                sh """ mvn \
                    -B -DskipTests \
                    -Dmaven.test.failure.ignore=true \
                    -Dmaven.javadoc.skip=true \
                    clean package"""
            }
            post {
                success {
                    archiveArtifacts 'moa/target/*.jar'
                }
            }
        }


        stage('Test') {
            steps {
                sh """mvn \
                    -Dmaven.test.failure.ignore=true \
                    -Dmaven.javadoc.skip=true \
                    test"""
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
