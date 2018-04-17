package singleton

class Singleton {
    companion object {
        private val singleton = Singleton()
        fun getInstance():Singleton = singleton
    }
    init {
        println("インスタンスを生成しました")
    }
}