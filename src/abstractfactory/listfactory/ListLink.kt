package abstractfactory.listfactory

import abstractfactory.factory.Link

class ListLink(caption:String, url: String): Link(caption = caption, url = url) {
    override fun makeHTML(): String {
        return " <li><a href=\"$url\">$caption</a></li>"
    }
}