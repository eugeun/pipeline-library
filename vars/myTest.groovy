#!/bin/groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    if (config.hello == null) {
      config.hello = 'Greetings'
    }

    echo "${config.hello}, World!"

}
