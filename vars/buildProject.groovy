def call() {
    withMaven(maven: 'maven') {
        sh 'mvn clean package -DskipTests'
    }
}
