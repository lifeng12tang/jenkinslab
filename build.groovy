package org.devops
#create clasifacation
def build(buildType,buildShell){
  def builtTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
  printin("this is $[buildType]")
  if ("$[buildType]")=="npm"{

    sh """
      export NODE_HOME=${buildHome}
      exprot PATH=\$NODE_HOME/bin:\$PATH
      ${buildHome}/bin/${buildType}${buildShell}"""
    else{
      sh "${buildHome}/bin/${buildType} ${buildShell}"
    }
}
