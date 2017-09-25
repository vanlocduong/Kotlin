import java.util.Random

fun main(args: Array<String>) {

    while (true) {
        choi()
        println("thím có muốn chơi nữa không có== c không == k")
        val tl= readLine()
        if(tl.equals("k",ignoreCase = true))
            break

    }
    println("hẹn gặp lại")

}
fun choi(){
    val random =Random()
    val soMay= random.nextInt(101)
    println("Máy đã đoán số rồi mời thím đoán số xem nào")
    var songuoi:Int = 0
    var solandoan:Int= 0
    do {
        println("thím chọn số mấy nào")
        var doanso = readLine()
        if(doanso != null)
            songuoi= doanso.toInt()
        solandoan ++
        println("thím đã đoán lần thứ + "+solandoan)
        if(songuoi == soMay){
            println("thím hay vậy đoán chuẩn vãi đái, số máy đoán là"+ soMay)
            break
        }
        if(songuoi > soMay){
            println("số người > Số mấy rồi thím ơi đoán lại cái coi")
            println("chỉ có 7 cơ hội thôi đó thím nge,thím đã dùng "+solandoan+" lần rồi")
        }else
            {
             println("số người < Số mấy rồi thím ơi đoán lại cái coi")
                println("chỉ có 7 cơ hội thôi đó thím nge,thím đã dùng "+solandoan+" lần rồi")
            }
        if(solandoan == 7){
            println("tạm biệt thím quá gà với trò chơi này")
            break
        }


    }while (solandoan <= 7)


}
