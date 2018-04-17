package prototype

abstract class Product: Cloneable {
    abstract fun use(s: String)
    abstract fun createClone(): Product
}