#!/usr/bin/groovy
package org.utils

class PipelineUtils { 
    static def deleteFile(String name) { 
        new File(name).delete()
        System.out.println(File.getAbsolutePath());
    } 
} 
