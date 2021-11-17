pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t=zai/sd ."
            }
        }
        stage('Push Image') {
            steps {
			    withDockerRegistry([ credentialsId: 'dockerHub', passwordVariable: 'pass', url: "" ]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push zai/sd:latest"
			    }
            }
        }
    }
}