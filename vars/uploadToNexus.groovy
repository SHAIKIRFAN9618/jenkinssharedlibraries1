def call() {
    stage('Upload to Nexus') {
        withCredentials([usernamePassword(credentialsId: 'nexus-creds', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
            sh """
            mvn deploy -DaltDeploymentRepository=nexus::default::http://your-nexus-server/repository/maven-releases \
            -Dnexus.username=$USERNAME -Dnexus.password=$PASSWORD
            """
        }
    }
}
