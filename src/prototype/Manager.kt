package prototype

class Manager {
    private val showcase = mutableMapOf<String, Product>()
    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }
    fun create(protoname: String): Product {
        val p: Product = showcase[protoname] as Product
        return p.createClone()
    }

}