package builder

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder: Builder() {
    private var filename: String = ""
    private var writer: PrintWriter? = null
    override fun buildTitle(title: String) {
        filename = "$title.html"
        try {
            writer = PrintWriter(FileWriter(filename))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        writer?.println("<html><head><title>$title</title></head><body>")
        writer?.println("<h1>$title</h1>")
    }
    override fun buildString(str: String) {
        writer?.println("<p>$str</p>")
    }
    override fun buildItems(items: Array<String>) {
        writer?.println("<ul>")
        for (i in 0..(items.size-1)) {
            writer?.println("<li>${items[i]}</li>")
        }
        writer?.println("</ul>")
    }
    override fun buildDone() {
        writer?.println("</body></html>")
        writer?.close()
        val filename: String = getResult()
        println("${filename}が作成されました")
    }
    fun getResult(): String = filename

}