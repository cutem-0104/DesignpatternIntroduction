package strategy

import java.util.*

class ProbStrategy(seed: Long): Strategy {
    private val random: Random = Random(seed)
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history = arrayOf(intArrayOf(1,1,1), intArrayOf(1,1,1), intArrayOf(1,1,1))

    override fun nextHand(): Hand {
        val bet: Int = random.nextInt(getSum(currentHandValue))
        val handValue = when {
            bet < history[currentHandValue][0] -> 0
            bet < history[currentHandValue][0] + history[currentHandValue][1] -> 1
            else -> 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    private fun getSum(hv: Int): Int {
        var sum = 0
        for (i in 0 until 3) {
            sum += history[hv][i]
        }
        return sum
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }
}