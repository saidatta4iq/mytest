def call(Map args = new LinkedHashMap()) {
    String server = args.get('server', 'docker.io')
    String credentialsId = args.get('credentialsId', 'dockerhub')
    def credentials = [usernamePassword(
            credentialsId: credentialsId,
            usernameVariable: 'USERNAME',
            passwordVariable: 'PASSWORD'
    )]
    print("all are able to start this")
    withCredentials(credentials) {
        sh "echo | set /p='${PASSWORD}' | docker login --username '${USERNAME}' ---password-stdin ${server}"
    }
}
