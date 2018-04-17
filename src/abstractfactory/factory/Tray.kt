package abstractfactory.factory

abstract class Tray(caption: String): Item(caption = caption) {
    protected val tray = ArrayList<Item>()
    fun add(item: Item) {
        tray.add(item)
    }

}