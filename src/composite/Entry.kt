package composite

abstract class Entry {
    internal var parent: Entry? = null
    abstract fun getName(): String
    abstract fun getSize(): Int
    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }

    fun printList() {
        printList("")
    }

    internal abstract fun printList(prefix: String)
    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }

    fun getFullName(): String {
        val fullname = StringBuffer()
        var entry: Entry? = this
        do {
            fullname.insert(0, "/${entry?.getName()}")
            entry = entry?.parent
        } while (entry != null)
        return fullname.toString()
    }
}