package builder

abstract class Builder {
    private var initialized: Boolean = false
    private var done: Boolean = false
    fun makeTitle(title: String) {
        if (!initialized && !done) {
            buildTitle(title)
            initialized = true
        }
    }
    fun makeString(str: String) {
        if (initialized && !done) {
            buildString(str)
        }
    }
    fun makeItems(items: Array<String>) {
        if (initialized && !done) {
            buildItems(items)
        }
    }
    fun close() {
        if (initialized && !done) {
            buildDone()
            done = true
        }
    }
    protected abstract fun buildTitle(title: String)
    protected abstract fun buildString(str: String)
    protected abstract fun buildItems(items: Array<String>)
    protected abstract fun buildDone()
}