def call() {
    stage('Deploy to Tomcat') {
        sshagent(['tomcatserveragent']) {
            sh 'scp -o StrictHostKeyChecking=no target/your-app.war ubuntu@192.168.1.100:/opt/tomcat9/webapps/'
            sh 'ssh -o StrictHostKeyChecking=no ubuntu@192.168.1.100 "bash /opt/tomcat9/bin/shutdown.sh; sleep 5; bash /opt/tomcat9/bin/startup.sh"'
        }
    }
}
