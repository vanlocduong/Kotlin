import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

/**
 * Created by cafe on 28/05/2017.
 */
fun main(args: Array<String>) {
    var cal=Calendar.getInstance()
    var year=cal.get(Calendar.YEAR)
    var month=cal.get(Calendar.MONTH)
    var day=cal.get(Calendar.DAY_OF_MONTH)
    println("Năm=$year")
    println("Tháng=$month")
    println("Ngày=$day")

    var date=cal.time
    var sdf=SimpleDateFormat("dd/MM/yyyy");
    println(sdf.format(date))
    var sdf2=SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
    println(sdf2.format(date))
}
