package decorator

class MultiStringDisplay : Display() {
    private var list = mutableListOf<String>()
    private var max = 0
    override fun getColumns() = max
    override fun getRows() = list.size
    override fun getRowText(row: Int): String? = list[row]
    fun add(str: String) {
        list.add(str)
        updateList()
    }
    fun updateList() {
        for (s in list) {
            max = if (max < s.toByteArray().size) s.toByteArray().size else max
        }
        for ((i, s) in list.withIndex()) {
            val count = max - s.toByteArray().size
            if (count == 0) continue
            val sb = StringBuffer()
            sb.append(s)
            for (i in 0 until count) {
                sb.append(' ')
            }
            list[i] = sb.toString()
        }
    }
}