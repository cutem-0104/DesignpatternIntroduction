package strategy.question

interface Sorter {
    fun <T> sort(data: Array<Comparable<T>>)
}