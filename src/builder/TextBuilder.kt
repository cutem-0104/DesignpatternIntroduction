package builder

class TextBuilder: Builder() {
    private val buffer: StringBuffer = StringBuffer()
    override fun buildTitle(title: String) {
        buffer.append("=================================\n")
        buffer.append("『${title}』\n")
        buffer.append("\n")
    }
    override fun buildString(str: String) {
        buffer.append("■$str\n")
        buffer.append("\n")
    }
    override fun buildItems(items: Array<String>) {
        for (i in 0..(items.size-1)) {
            buffer.append(" .${items[i]}\n")
        }
        buffer.append("\n")
    }
    override fun buildDone() {
        buffer.append("================================\n")
        val result: String = getResult()
        println(result)
    }
    fun getResult():String = buffer.toString()
}