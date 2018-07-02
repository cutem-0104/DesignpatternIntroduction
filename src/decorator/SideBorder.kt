package decorator

class SideBorder(display: Display,
                 private val borderChar: Char): Border(display = display) {
    override fun getColumns() = 1 + display.getColumns() + 1
    override fun getRows() = display.getRows()
    override fun getRowText(row: Int): String? =
            borderChar.toString() + display.getRowText(row) + borderChar.toString()
}