package prototype

class MessageBox(private val decochar: Char): Product() {
    override fun use(s: String) {
        val length: Int = s.toByteArray().size
        for (i in 0..length + 4) {
            print(decochar)
        }
        println()
        println("$decochar $s $decochar")
        for (i in 0..length + 4) {
            print(decochar)
        }
        println()
    }
    override fun createClone(): Product {
        return clone() as Product
    }
}