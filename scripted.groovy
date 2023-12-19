node {
   stage('pull code') {
    git 'https://github.com/gauravvinchurkar/jenkins.git'
   }
   stage('build') {
    sh '''ls
          pwd
       '''
   }
   stage('build') {
    echo 'code deployed'
   }
}