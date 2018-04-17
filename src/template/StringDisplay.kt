package template

class StringDisplay(private val string: String): AbstractDisplay() {
    private val width = string.toByteArray(Charsets.UTF_8).size

    override fun open() {
        printLine()
    }
    override fun print() {
        println("|$string|")
    }
    override fun close() {
        printLine()
    }
    private fun printLine() {
        print("+")
        for (i in 0 until width) {
            print("-")
        }
        println("+")
    }
}