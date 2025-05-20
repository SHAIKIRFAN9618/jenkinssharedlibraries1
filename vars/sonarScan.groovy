def call() {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQubeServer') {
            // Explicitly load Maven tool to ensure mvn command is available
            def mvnHome = tool 'maven'  // Make sure this matches what you configured in Jenkins
            withEnv(["PATH+MAVEN=${mvnHome}/bin"]) {
                sh 'mvn sonar:sonar'
            }
        }
    }
}
