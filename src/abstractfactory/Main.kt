package abstractfactory

import abstractfactory.factory.Factory
import abstractfactory.factory.Link
import abstractfactory.factory.Tray
import java.lang.System.exit

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: java Main class.name.of.ConcreteFactory")
        println("Example 1: java Main listfactory.ListFactory")
        println("Example 2: java Main tablefactory.TableFactory")
        exit(0)
    }
    val factory = Factory.getFactory(args[0])

    val asahi: Link = factory!!.createLink("朝日新聞", "http://www.asahi.com/")
    val yomiuri: Link = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/")

    val us_yahoo: Link = factory.createLink("Yahoo!", "http://www.yahoo.com/")
    val jp_yahoo: Link = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/")
    val excite: Link = factory.createLink("Excite", "http://www.excite.com/")
    val google: Link = factory.createLink("Google", "http://www.google.com/")

    val traynews: Tray = factory.createTray("新聞")
    traynews.add(asahi)
    traynews.add(yomiuri)

    val trayyahoo = factory.createTray("Yahoo!")
    trayyahoo.add(us_yahoo)
    trayyahoo.add(jp_yahoo)

    val traysearch = factory.createTray("サーチエンジン")
    traysearch.add(trayyahoo)
    traysearch.add(excite)
    traysearch.add(google)

    val page = factory.createPage("LinkPage", "結城　浩")
    page.add(traynews)
    page.add(trayyahoo)
    page.add(traysearch)
    page.output()

    val yahooPage = factory.createYahooPage()
    yahooPage.output()
}