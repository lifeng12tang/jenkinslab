package org.devops
#create clasifacation
def build(buildType,buildShell){
  def builtTools = ["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
  printin("this is $[buildType]")
  buildHome = tool buildTools[buildType]

  sh "$[buildHome]/bin/#[buildType] $[buildShell]"


}
