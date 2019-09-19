pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            echo 'this my first jenkins build '
            echo 'it can be a second step'
            echo 'it will be the third step'
          }
        }
        stage('test') {
          steps {
            echo 'second stage'
          }
        }
      }
    }
  }
}