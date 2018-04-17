package singleton

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    println("Start")
    val obj1 = Singleton.getInstance()
    val obj2 = Singleton.getInstance()
    if (obj1 == obj2) {
        println("same")
    } else {
        println("not same")
    }
    println("End")

    thread {
        println("Start")
        for (i in 0..10) {
            println("$i:${TicketMaker.getInstance().getNextTicketNumber()}")
        }
        println("End")
    }
    thread {
        println("Start")
        for (i in 0..10) {
            println("$i:${TicketMaker.getInstance().getNextTicketNumber()}")
        }
        println("End")
    }

    val triple = Triple
    println(triple.getInstance(0))
    println(triple.getInstance(1))
    println(triple.getInstance(2))

}
