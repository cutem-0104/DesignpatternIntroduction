package prototype

fun main(args: Array<String>) {
    val manager = Manager()
    val upen = UnderlinePen('-')
    val mbox = MessageBox('*')
    val sbox = MessageBox('/')

    manager.register("strong message", upen)
    manager.register("warning box", mbox)
    manager.register("slash box", sbox)

    val p1 = manager.create("strong message")
    p1.use("Hello world")
    val p2 = manager.create("warning box")
    p2.use("Hello world")
    val p3 = manager.create("slash box")
    p3.use("Hello world")

}