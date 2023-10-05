pipeline {
	agent {
		label 'aws'
	}

	tools {
		jdk 'java17'
	}

	stages {

		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}

		stage('ECS') {

			steps {
				script{
					sh('''
						#!/usr/bin/env bash
							aws ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 230655397690.dkr.ecr.us-east-2.amazonaws.com
							DOCKER_REPO=`aws ecr describe-repositories --repository-names jenkins-repo | grep repositoryUri | cut -d "\\"" -f 4`
							docker build --no-cache -t ${DOCKER_REPO}:1.0 .
							docker push ${DOCKER_REPO}:1.0
							
							dockerRepo=`aws ecr describe-repositories --repository-name jenkins-repo --region us-east-2 | grep repositoryUri | cut -d "\\"" -f 4`
							dockerTag=`aws ecr list-images --repository-name jenkins-repo --region us-east-2 | grep imageTag | head -n 1 | cut -d "\\"" -f 4`
							sed -e "s;DOCKER_IMAGE_NAME;${DOCKER_REPO};g" deploy/template.json > taskDefinition.json
							aws ecs register-task-definition --family boucher-task --cli-input-json file://taskDefinition.json --region us-east-2
							revision=`aws ecs describe-task-definition --task-definition boucher-task --region us-east-2 | grep "revision" | tr -s " " | cut -d " " -f 3`
							aws ecs update-service --cluster boucher-fargate-cluster --service boucher-core --task-definition boucher-task --desired-count 1
						''')
				}
			}
		}
	}
}
