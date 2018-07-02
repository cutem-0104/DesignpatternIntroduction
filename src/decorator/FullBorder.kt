package decorator

class FullBorder(display: Display): Border(display = display) {
    override fun getColumns() = 1 + display.getColumns() + 1
    override fun getRows() = 1 + display.getRows() + 1
    override fun getRowText(row: Int): String? {
        return when (row) {
            0 -> "+${makeLine('-', display.getColumns())}+"
            display.getRows() + 1 -> "+${makeLine('-', display.getColumns())}+"
            else -> "|${display.getRowText(row - 1)}|"
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