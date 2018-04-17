package bridge

class IncreaseDisplay(impl: DisplayImpl, private val step: Int): CountDisplay(impl = impl) {
    fun increaseDisplay(level: Int) {
        var count = 0
        for (i in 0 until level) {
            multiDisplay(count)
            count += step
        }
    }
}