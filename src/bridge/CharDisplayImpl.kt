package bridge

class CharDisplayImpl(private val head: Char,
                      private val body: Char,
                      private val foot: Char): DisplayImpl() {
    override fun rawOpen() {
        print(head)
    }

    override fun rawPrint() {
        print(body)
    }

    override fun rawClose() {
        println(foot)
    }
}