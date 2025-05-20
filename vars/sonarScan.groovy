def call() {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQubeServer') {
            sh 'mvn sonar:sonar'
        }
    }
}
