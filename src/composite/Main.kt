package composite

fun main(args: Array<String>) {
    try {
        println("Makeing root entries...")
        val rootdir = Directory("root")
        val bindir = Directory("bin")
        val tmpdir = Directory("tmp")
        val usrdir = Directory("usr")
        rootdir.add(bindir)
        rootdir.add(tmpdir)
        rootdir.add(usrdir)
        bindir.add(File("vi", 10000))
        bindir.add(File("latex", 20000))
        rootdir.printList()

        println("")
        println("Making user entries...")
        val yuki = Directory("yuki")
        val hanako = Directory("hanako")
        val tomura = Directory("tomura")
        usrdir.add(yuki)
        usrdir.add(hanako)
        usrdir.add(tomura)
        yuki.add(File("diary.html", 100))
        val file = File("Composite.java", 200)
        yuki.add(file)
        hanako.add(File("memo.txt", 300))
        hanako.add(File("game.doc", 400))
        tomura.add(File("junk.mail", 500))
        rootdir.printList()

        println("file = ${file.getFullName()}")
    } catch(e: FileTreatmentException) {
        e.printStackTrace()
    }
}
