package decorator

fun main(args: Array<String>) {
    val b1: Display = StringDisplay("Hello, world.")
    val b2: Display = UpDownBorder(b1, '#')
    val b3: Display = FullBorder(b2)
    b1.show()
    b2.show()
    b3.show()
    val b4: Display =
            SideBorder(
                    UpDownBorder(
                            FullBorder(
                                    SideBorder(
                                            FullBorder(
                                                    StringDisplay("hello")
                                            ), '#'
                                    )
                            ), '-'
                    ), '/'
            )
    b4.show()

    var md = MultiStringDisplay()
    md.add("ssssssss")
    md.add("dsafasdfffff")
    md.add("dfdfddd")
    md.show()
    val d1 = SideBorder(md, '#')
    val d2 = FullBorder(md)
    d1.show()
    d2.show()
}
