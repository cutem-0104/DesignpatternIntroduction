package factorymethod.idcard

import factorymethod.factory.Product

class IDCard(private val owner: String): Product() {
    private var id: Int = 0
    companion object {
        var count: Int = 1
    }
    init {
        setId()
        println("${owner}(${getId()})のカードを作ります")
        count++
    }
    override fun use() = println("${owner}のカードを使います。")
    fun getOwner(): String = owner
    fun getId(): Int = id
    fun setId() {
        this.id = count
    }


}