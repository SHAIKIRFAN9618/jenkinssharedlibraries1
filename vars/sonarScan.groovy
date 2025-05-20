def call() {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQubeServer') {
            withMaven {
            sh 'mvn sonar:sonar'
        }
    }
  }
}
