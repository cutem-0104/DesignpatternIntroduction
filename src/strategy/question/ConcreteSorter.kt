package strategy.question

class ConcreteSorter: Sorter {
    override fun <T> sort(data: Array<Comparable<T>>) {
        for (i in 0 until data.size) {
            var min = i
            for (j in (i + 1) until data.size) {
                if (data[min] < data[j] as T) {
                    min = j
                }
            }
            val passingplace = data[min]
            data[min] = data[i]
            data[i] = passingplace
        }
    }
}