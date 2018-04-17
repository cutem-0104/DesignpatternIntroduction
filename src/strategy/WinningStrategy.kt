package strategy

import java.util.*


class WinningStrategy(seed: Long): Strategy {
    private val random: Random = Random(seed)
    private var won = false
    private var prevHand: Hand = Hand.getHand(random.nextInt(3))
    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}