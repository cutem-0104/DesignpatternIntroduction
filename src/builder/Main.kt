package builder

import java.lang.System.exit

fun usage() {
    println("Usage: java Main plain     プレーンテキストで文書作成")
    println("Usage: java Main html      htmlファイルで文書作成")
    println("Usage: java Main frame     windowで文書作成")
}

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage()
        exit(0)
    }
    val builder = when {
        args[0] == "plain" -> TextBuilder()
        args[0] == "html" -> HTMLBuilder()
        args[0] == "frame" -> ConcreteBuilder()
        else -> null
    }
    if (builder == null) {
        usage()
        exit(0)
    }
    assert(builder != null)
    val director = Director(builder!!)
    director.construct()
}
