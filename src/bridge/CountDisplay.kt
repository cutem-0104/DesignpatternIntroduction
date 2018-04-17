package bridge

open class CountDisplay(impl: DisplayImpl): Display(impl = impl) {
    fun multiDisplay(times: Int) {
        open()
        for (i in 0..(times-1)) {
            print()
        }
        close()
    }
}