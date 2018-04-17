package abstractfactory.factory

import java.io.*
import java.io.IOException

abstract class Page(protected val title: String, protected val author: String): HTMLLable {
    protected val content = ArrayList<Item>()
    fun add(item: Item) {
        content.add(item)
    }
    fun output() {
        try {
            val filename = "$title.html"
            val writer: Writer = FileWriter(filename)
            writer.write(this.makeHTML())
            writer.close()
            println("$filename を作成しました。")
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}