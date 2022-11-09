def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
        sh 'docker build -t deyemzy/my-repo:jma-1.2 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push deyemzy/my-repo:jma-1.2'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
