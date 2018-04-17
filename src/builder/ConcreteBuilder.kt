package builder

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.lang.System.exit
import javax.swing.*

class ConcreteBuilder: Builder(), ActionListener {
    private val frame = JFrame()
    private val box = Box(BoxLayout.Y_AXIS)
    override fun buildTitle(title: String) {
        frame.title = title
    }

    override fun buildString(str: String) {
        box.add(JLabel(str))
    }

    override fun buildItems(items: Array<String>) {
        val innerbox = Box(BoxLayout.Y_AXIS)
        for (i in 0..(items.size-1)) {
            val button = JButton(items[i])
            button.addActionListener(this)
            innerbox.add(button)
        }
        box.add(innerbox)
    }

    override fun buildDone() {
        frame.contentPane.add(box)
        frame.pack()
        frame.addWindowListener(WindowA())
        val frame = getResult()
        frame.isVisible = true
    }

    override fun actionPerformed(e: ActionEvent) {
        println(e.actionCommand)
    }

    fun getResult(): JFrame {
        return frame
    }
}

class WindowA : WindowAdapter() {
    override fun windowClosing(e : WindowEvent?){
        exit(0)
    }
}