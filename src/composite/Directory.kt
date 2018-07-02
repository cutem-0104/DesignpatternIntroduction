package composite

class Directory(private val name: String) : Entry() {
    private var directory:List<Entry> = mutableListOf()
    override fun getName() = name
    override fun getSize(): Int {
        var size = 0
        val it = directory.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            size += entry.getSize()
        }
        return size
    }

    override fun add(entry: Entry): Entry {
        directory += entry
        entry.parent = this
        return this
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        val it = directory.iterator()
        while (it.hasNext()) {
            val entry = it.next()
            entry.printList("$prefix/$name")
        }
    }
}