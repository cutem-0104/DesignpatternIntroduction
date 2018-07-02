package decorator

class StringDisplay(val string: String) : Display() {
    override fun getColumns() = string.toByteArray().size

    override fun getRows() = 1
    override fun getRowText(row: Int) = if (row == 0) string else null
}