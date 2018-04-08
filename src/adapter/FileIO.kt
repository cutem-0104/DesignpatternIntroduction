package adapter

import java.io.*

interface FileIO {
    @Throws(IOException::class)
    fun readFromFile(filename: String)

    @Throws(IOException::class)
    fun writeToFile(filename: String)

    fun setValue(key: String, value: String)
    fun getValue(key: String): String
}