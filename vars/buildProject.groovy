def call() {
    withMaven(maven: 'maven') {
        sh 'mvn clean package verify'
    }
}
