import javax.swing.JFrame

fun main(args: Array<String>) {
    var frm:JFrame= JFrame("Duonng Van Loc")
    frm.defaultCloseOperation= JFrame.EXIT_ON_CLOSE
    frm.contentPane = FormMain().pmain
    frm.setSize(300,250)
    frm.setLocationRelativeTo(null)
    frm.isVisible= true
}