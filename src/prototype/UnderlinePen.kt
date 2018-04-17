package prototype

class UnderlinePen(private val ulchar: Char): Product() {
    override fun use(s: String) {
        val length: Int = s.toByteArray().size
        println("\"$s\"")
        print(" ")
        for (i in 0..length) {
            print(ulchar)
        }
        println()
    }

    override fun createClone(): Product {
        return clone() as Product
    }
}