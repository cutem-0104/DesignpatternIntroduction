package singleton

import kotlin.concurrent.withLock

class TicketMaker {
    companion object {
        private var ticket: Int = 1000
        private val ticketMaker = TicketMaker()
        fun getInstance():TicketMaker = ticketMaker
    }
    val lock = java.util.concurrent.locks.ReentrantLock()
    fun getNextTicketNumber(): Int {
        lock.withLock {
            return ticket++
        }
    }
}