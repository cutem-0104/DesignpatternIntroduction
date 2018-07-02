package visitor

fun main(args: Array<String>) {
    try {
        println("Making root entries...")
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tmpDir = Directory("tmp")
        val usrDir = Directory("usr")
        rootDir.add(binDir)
        rootDir.add(tmpDir)
        rootDir.add(usrDir)
        binDir.add(File("vi", 10000))
        binDir.add(File("latex", 20000))
        rootDir.accept(ListVisitor())

        println("")
        println("Making user entries...")
        val yuki = Directory("yuki")
        val hanako = Directory("hanako")
        val tomura = Directory("tomura")
        usrDir.add(yuki)
        usrDir.add(hanako)
        usrDir.add(tomura)
        yuki.add(File("diary.html", 100))
        yuki.add(File("Composite.java", 200))
        hanako.add(File("memo.txt", 300))
        hanako.add(File("game.doc", 400))
        tomura.add(File("junk.mail", 500))
        rootDir.accept(ListVisitor())
    } catch (e: FileTreatmentException) {
        e.printStackTrace()
    }
}