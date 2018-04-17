package singleton

class Triple(private var id: Int) {
    init {
        println("The instance $id is created")
        this.id = id
    }
    companion object {
        private val triple: List<Triple> = listOf(Triple(0), Triple(1), Triple(2))
        fun getInstance(id: Int): Triple {
            return triple[id]
        }
    }
    override fun toString():String = "[Triple id=$id]"


}