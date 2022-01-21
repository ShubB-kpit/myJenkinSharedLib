#!/usr/bin/env groovy

def call(String name = 'human') {
    new File(name).delete()
    echo "Hello, ${name}."
}
