node {
    try{
        emailext body: "starting... BID $BUILD_ID, my mail is kicking alright.", subject: "Hallo, I\'m Kiching", to: "kehinde.adewusi@gmail.com"
        stage('checkout') {
            checkout scm
            //git 'https://github.com/kehindeadewusi/experimento.git'
        }
        stage('build'){
            sh label: '', script: 'mvn clean verify'
        }
        stage('archive'){
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/jacoco/', reportFiles: 'index.html', reportName: 'Code Coverage Report', reportTitles: 'Code Coverage Report'])
            archiveArtifacts 'target/*.jar'
            step([$class: 'JUnitResultArchiver', testResults: 'target/surefire-reports/TEST-*.xml'])
        }
        emailext body: "ending... BID $BUILD_ID, my mail is kicking alright.", subject: "Hallo, I\'m Kiching", to: "kehinde.adewusi@gmail.com"
    }
    catch(err){
        emailext body: "error... BID $BUILD_ID, ${err}", subject: "Hallo, I\'m Kiching", to: "kehinde.adewusi@gmail.com"
        currentBuild.result = 'FAILURE'
    }
}
