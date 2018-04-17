package strategy

class Hand(private val handvalue: Int) {
    companion object {
        const val HANDVALUE_GUU: Int = 0
        const val HANDVALUE_CHO: Int = 1
        const val HANDVALUE_PAA: Int = 2
        private val hand = arrayOf(
                Hand(HANDVALUE_GUU),
                Hand(HANDVALUE_CHO),
                Hand(HANDVALUE_PAA)
        )
        private val name = arrayOf("グー", "チョキ", "パー")
        fun getHand(handvalue: Int) = hand[handvalue]
    }
    fun isStrongerThan(h: Hand): Boolean = fight(h) == 1
    fun isWeakerThan(h: Hand): Boolean = fight(h) == -1

    private fun fight(h: Hand): Int {
        return when {
            this == h -> 0
            (this.handvalue + 1) % 3 == h.handvalue -> 1
            else -> -1
        }
    }
    override fun toString() = name[handvalue]

}

