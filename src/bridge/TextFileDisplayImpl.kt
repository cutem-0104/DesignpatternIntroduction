package bridge

import java.io.*

class TextFileDisplayImpl(private val filename: String): DisplayImpl() {
    private var reader: BufferedReader = BufferedReader(FileReader(filename))
    private val MAX_READAHEAD_LIMIT: Int = 4096

    override fun rawOpen() {
        try {

            reader.mark(MAX_READAHEAD_LIMIT)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        println("=-=-=-=-=-=$filename=-=-=-=-=-=")
    }

    override fun rawPrint() {
        try {
//            reader.reset()
            var line = reader.readLine()
            while (line != null) {
                println("> $line")
                line = reader.readLine()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    override fun rawClose() {
        println("=-=-=-=-=-=")
        try {
            reader.close()
        } catch(e: IOException) {
            e.printStackTrace()
        }
    }
}