package adapter

class PrintBanner(private val string: String) : Banner(string), Print {
    override fun printWeak() {
        showWithParen()
    }
    override fun printStrong() {
        showWithAster()
    }
    fun show() {
        println(string)
    }
}