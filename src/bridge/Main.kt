package bridge

fun main(args: Array<String>) {
    val d1: Display = Display(StringDisplayImpl("Hello, Japan."))
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, World."))
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Hello, Universe."))
    val d4: RandomDisplay = RandomDisplay(StringDisplayImpl("test"))
    val d5: CountDisplay = CountDisplay(TextFileDisplayImpl("././start.txt"))
    val d6: IncreaseDisplay = IncreaseDisplay(CharDisplayImpl('<', '*', '>'), 1)
    val d7: IncreaseDisplay = IncreaseDisplay(CharDisplayImpl('|', '#', '-'), 2)

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
    d4.randomDisplay(5)
    d5.multiDisplay(2)
    d6.increaseDisplay(4)
    d7.increaseDisplay(6)
}
