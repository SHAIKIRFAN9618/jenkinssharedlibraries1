def call() {
    stage('Clone and Build') {
        checkout scm // clone the current project code
        sh 'mvn clean package -DskipTests' // build the project using Maven
    }
}
