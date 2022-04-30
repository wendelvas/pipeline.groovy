#!/usr/bin/env groovy

pipeline {
    //Agent é o NÓ que vai rodar o job
    agent any

    //Fases do pipeline
    stages {
        
       stage('Checkout') {
            steps {
                script {
                    echo 'fazer checkout do projeto'
                }
            }
        }
        
         stage( 'bloco de nota' ) {
            steps {
                script {
                    echo 'fazer checkout bloco de nota'
                  }
                }
             }
         stage( 'teste' ) {
            steps {
                script {
                    echo 'fazer checkout teste'
                      }
                  }
               }
     }
}
