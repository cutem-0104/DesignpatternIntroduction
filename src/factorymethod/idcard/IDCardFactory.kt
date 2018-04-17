package factorymethod.idcard

import factorymethod.factory.Factory
import factorymethod.factory.Product

class IDCardFactory(): Factory() {
    private val owners: MutableList<String> = mutableListOf()
    private val map: MutableMap<Int, String> = mutableMapOf()
    override fun createProduct(owner: String): Product = IDCard(owner)
    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
        map.put(product.getId(), product.getOwner())
    }
    fun getOwners() = owners
    fun getMap() = map
}