package strategy.question

class ConcreteSorter: Sorter {
    lateinit var data: Array<Comparable<Object>>
    override fun <T> sort(data: Array<Comparable<T>>) {
        this.data = data as Array<Comparable<Object>>
        qsort(0, data.size - 1)
    }
    private fun qsort(pre1: Int, post1: Int) {
        var pre = pre1
        var post = post1
        val savedPre: Int = pre
        val savedPost: Int = post
        val mid: Comparable<Object> = data[(pre + post) / 2]
        do {
            while (data[pre] > mid as Object) {
                pre++
            }
            while (data[post] < mid as Object) {
                pre--
            }
            if (pre <= post) {
                val tmp = data[pre]
                data[pre] = data[post]
                data[post] = tmp
                pre++
                post--
            }
        } while (pre <= post)
        if (savedPre < post) {
            qsort(savedPre, post)
        }
        if (pre < savedPost) {
            qsort(pre, savedPost)
        }
    }
}