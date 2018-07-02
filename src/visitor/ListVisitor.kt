package visitor

class ListVisitor: Visitor() {
    private var currentdir = ""
    override fun visit(file: File) {
        println("$currentdir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentdir/$directory")
        val saveDir = currentdir
        currentdir = "$currentdir/${directory.getName()}"
        val it = directory.iterator()
        while (it.hasNext()) {
            var entry = it.next()
            entry.accept(this)
        }
        currentdir = saveDir
    }
}
