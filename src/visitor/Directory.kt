package visitor

class Directory(private val name: String): Entry() {
    private var dir = mutableListOf<Entry>()
    override fun getName() = name
    override fun getSize(): Int {
        var size = 0
        val it = dir.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            size += entry.getSize()
        }
        return size
    }
    override fun add(entry: Entry):Entry {
        dir.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> = dir.iterator()
    override fun accept(v: Visitor) {
        v.visit(this)
    }
}