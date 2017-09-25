fun main(args: Array<String>) {
    // indexof trả về vị trí đầu tiên được tìm thấy không trả về -1
    var string:String="vanlocduong"
    var i = 0
    i = string.indexOf("d")
    println(i)
    // lastIndexof trả về vị trí cuoi được tìm thấy không trả về -1

    i = string.lastIndexOf("n")
    println(i)
    //•	Contains kiểm tra chuỗi con có tồn tại trong chuỗi gốc hay không, có thì trả về true, còn không trả về false
    var sub:String="van"
    if(string.contains(sub)){
        println("co ton tai sub $sub")
    }else{
        print("khong ton tai sub $sub" +
                "")
    }
    // •	subString – trích lọc chuỗi

    var s2 = string.substring(3)
    println(s2)
    var s3= string.substring(3,6)
    println(s3)
    // •	replace – đổi chuỗi cũ thành chuỗi mới
    var  s4:String = "toiyeubanbandungyeutoi"
    var s5:String="stop yeu"
    s4= s4.replace("toi","hay ")
    println(s4)
    // •	replaceFirst-Đổi chuỗi cũ thành chuỗi mới nhưng chỉ áp dụng cho chuỗi đầu tiên tìm thấy

    s4=s4.replaceFirst("ban","you")
    println(s4)

    var s6:String ="   Duong Van loc   "
    var s7= s6.trim()
    println(s7)
    var s8= s6.trimStart()
    println(s8)
    var s9= s6.trimEnd()
    println(s9)
    // •	compareTo – so sánh chuỗi
    val s10 = "Hạnh phúc"
    val s11 = "Hạnh PHÚC"
    val x = s10.compareTo(s11, ignoreCase = true)
    println(x)
    val y = s10.compareTo(s11, ignoreCase = false)
    println(y)
    //•	plus– nối chuỗi
    //•	split– tách chuỗi theo tiêu chí bất kỳ, trả về một List<String>
    var s12:String="I love you so much."
    var arr:List<String> = s12.split(" ")
    for (x in arr)
    {
        println(x)
    }
    //•	toUpperCase, toLowerCase để chuyển CHỮ HOA, chữ thường




}