package abstractfactory.factory

abstract class Link(protected val url: String,
                    caption: String): Item(caption = caption)
