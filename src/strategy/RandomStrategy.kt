package strategy

import java.util.*

class RandomStrategy(seed: Long): Strategy {
    private val random: Random = Random(seed)

    override fun nextHand(): Hand {
        val handValue: Int = random.nextInt(3)
        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
    }
}