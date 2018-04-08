package adapter

class APrintBanner(string: String): AbstractPrint() {
    private val banner = Banner(string)
    override fun printWeak() {
        banner.showWithParen()
    }
    override fun printStrong() {
        banner.showWithAster()
    }

}
