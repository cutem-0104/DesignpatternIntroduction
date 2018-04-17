package strategy

import java.lang.System.exit

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: java Main randomseed1 randomseed2")
        println("Example: java Main 314 15")
        exit(0)
    }
    val seed1 = args[0].toLong()
    val seed2 = args[1].toLong()
    val player1 = Player("Taro", WinningStrategy(seed1))
    val player2 = Player("Hana", RandomStrategy(seed2))

    for (i in 0 until 10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()

        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner:$player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner:$player2")
                player2.win()
                player1.lose()
            }
            else -> {
                println("Even...")
                player1.even()
                player2.even()
            }
        }
    }
    println("Total Result:")
    println(player1.toString())
    println(player2.toString())
}