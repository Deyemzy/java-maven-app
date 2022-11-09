#!/usr/bin/env groovy

pipeline {
    agent none
    stages {
        stage('test') {
            steps {
                script {
                    echo "Testing the application..."
                    echo "Executing pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage('build') {
            when {
                expressiom {
                    BRANCH_NAME =='master'
                }
            }
            steps {
                script {
                    echo "Building the application..."
                }
            }
        }
        
        stage('deploy') {
             when {
                expressiom {
                    BRANCH_NAME =='master'
                }
            }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}

