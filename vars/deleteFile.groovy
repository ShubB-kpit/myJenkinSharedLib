#!/usr/bin/groovy
def call(String name) { 
    new File(name).delete() 
} 

