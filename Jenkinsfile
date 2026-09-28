// Phase 1 pipeline: get code, test, package, build the Docker image.
// Push-to-registry and deploy stages get added in later phases.
pipeline {
  agent any

  environment {
    IMAGE = "orders-service:${env.BUILD_NUMBER}"
  }

  stages {
    stage('Get code') {
      steps { checkout scm }
    }
    stage('Test') {
      steps { sh 'mvn clean test' }
    }
    stage('Package') {
      steps { sh 'mvn package -DskipTests' }
    }
    stage('Docker build') {
      steps { sh 'docker build -t $IMAGE .' }
    }
  }

  post {
    success { echo "Build ${env.BUILD_NUMBER} passed" }
    failure { echo "Build ${env.BUILD_NUMBER} failed, check the stage that turned red" }
  }
}
