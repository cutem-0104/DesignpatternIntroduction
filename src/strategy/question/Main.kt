package strategy.question

fun main(args: Array<String>) {
    val data: Array<Comparable<String>> = arrayOf("Dumpty", "Bowman", "Carroll", "Elfland", "Alice")
    val sap = SortAndPrint(data, ConcreteSorter())
    sap.execute()
}
