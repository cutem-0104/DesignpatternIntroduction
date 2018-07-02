package decorator

class UpDownBorder(display: Display,
                   private val borderChar: Char): Border(display = display) {
    override fun getColumns() = display.getColumns()
    override fun getRows() = 1 + display.getRows() + 1
    override fun getRowText(row: Int): String? {
        return when (row) {
            0 -> makeLine(borderChar, display.getColumns())
            display.getRows() + 1 -> makeLine(borderChar, display.getColumns())
            else -> "${display.getRowText(row - 1)}"
        }
    }

    private fun makeLine(ch: Char, count: Int): String {
        val buf = StringBuffer()
        for (i in 0 until count) {
            buf.append(ch)
        }
        return buf.toString()
    }
}