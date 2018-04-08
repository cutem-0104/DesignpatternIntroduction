package adapter

import java.io.*

fun main(args: Array<String>) {
    val p: Print = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()

    val p2: AbstractPrint = APrintBanner("Hello")
    p2.printWeak()
    p2.printStrong()

    // 問題2-2
    val f: FileIO = FileProperties()
    try {
        f.readFromFile("././file.txt")
        f.setValue("year", "2004")
        f.setValue("month", "4")
        f.setValue("day", "21")
        f.writeToFile("newfile.txt")
    } catch (e: IOException) {
        e.printStackTrace()
    }


}