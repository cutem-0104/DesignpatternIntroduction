package factorymethod

import factorymethod.factory.*
import factorymethod.idcard.*

fun main(args: Array<String>) {
    val factory: Factory = IDCardFactory()
    val card1: Product = factory.create("結城浩")
    val card2: Product = factory.create("とむら")
    val card3: Product = factory.create("佐藤花子")
    card1.use()
    card2.use()
    card3.use()
    val m = (factory as IDCardFactory).getMap()
    println(m[1])
    println(m[2])
    println(m[3])
}
