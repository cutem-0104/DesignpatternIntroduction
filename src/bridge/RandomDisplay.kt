package bridge

import java.util.*

class RandomDisplay(impl: DisplayImpl): Display(impl = impl) {
    fun randomDisplay(times: Int) {
        val rand = Random()
        open()
        for (i in 0 until rand.nextInt(times)) {
            print()
        }
        close()
    }
}