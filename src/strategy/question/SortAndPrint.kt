package strategy.question

class SortAndPrint<T>(val data: Array<Comparable<T>>, val sorter: Sorter) {
    fun execute() {
        print()
        sorter.sort(data)
        print()
    }
    fun print() {
        for (i in 0 until data.size) {
            print("${data[i]}, ")
        }
        println(" ")
    }
}
