package angel.gallegos.command


import grails.dev.commands.*

class MyExampleCommand implements GrailsApplicationCommand {

    boolean handle() {
        println 'command running...'
        true
    }
}
