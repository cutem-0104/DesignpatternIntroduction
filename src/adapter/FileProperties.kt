package adapter

import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.Properties

class FileProperties: FileIO, Properties() {

    override fun readFromFile(filename: String) {
        val fis = FileInputStream(filename)
        load(fis)
        fis.close()
    }

    override fun writeToFile(filename: String) {
        val fos = FileOutputStream(filename)
        store(fos, "written by FileProperties")
        fos.close()
    }

    override fun setValue(key: String, value: String) {
        setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return getProperty(key)
    }
}
