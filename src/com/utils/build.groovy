package com.utils
import com.utils.Constants

class buid implements Serialization {

    mavenBuild(){
        println "maven version"
        println Constants.mavenVersion
    }

    /*build node code*/
    def nodeBuild(self){
        println "building node code"
    }

}

