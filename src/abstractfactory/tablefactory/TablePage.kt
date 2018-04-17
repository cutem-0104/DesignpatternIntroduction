package abstractfactory.tablefactory

import abstractfactory.factory.Page

class TablePage(title: String, author: String): Page(title = title, author = author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>\n")
        buffer.append("<body>\n")
        buffer.append("<h1>$title</h1>")
        buffer.append("<table width=\"80%\" border=\"3\">\n")
        var it = content.iterator()
        while (it.hasNext()) {
            val item = it.next()
            buffer.append("<tr>${item.makeHTML()}</tr>")
        }
        buffer.append("</table>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }
}