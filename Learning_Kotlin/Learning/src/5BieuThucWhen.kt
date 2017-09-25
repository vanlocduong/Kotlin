fun main(args: Array<String>) {
    var numberChoose: Int = 9
    when (numberChoose) {
        1 -> println("you are choose my girlfriend ")
        2 -> println("you are choose my bestfriend")
        3 -> println("you are choose married me")
        4 -> println("you are choose all my familly")
        else -> println("I don't want choose anybody else in the world")
    }
    // input a and b with one + - * / and calculate with a and b
    var a: Int = 0
    var nhap = readLine()
    if (nhap != null)
        a = nhap.toInt()
    var b: Int = 0
    nhap = readLine()
    if (nhap != null)
        b = nhap.toInt()
    var bieuthuc: String?
    println("nhap vao biet thuc tinh toan ")
    bieuthuc = readLine()
    when (bieuthuc) {
        "+" -> println(a.toString() + " + " + b.toString() + " = " + (a.plus(b)))
        "-" -> println(a.toString() + " - " + b.toString() + " = " + (a.minus(b)))
        "*" -> println(a.toString() + " * " + b.toString() + " = " + (a.times(b)))
        "/" -> if (b == 0)
            println("you inputting number am , you need input new number")
        else
            println(a.toString() + " / " + b.toString() + " = " + (a.div(b)))
        else -> println("you are just kidding me")

    }
    /*
    * Kotlin cũng cho phép ta gom nhóm nhiều điều kiện trong biểu thức when
    * nếu như các giá trị này cùng giải quyết một vấn đề nào đó bằng cách dùng dấu phẩy ,
     * để ngăn cách các giá trị:
    *
    * */
    var month:Int=0
    println("input month need inspect")
    var s:String?= readLine()
    if(s != null)
        month= s.toInt()
    when(month){
        1,2,3-> println("month is "+ month + " bellow quy 1")
        4,5,6-> println("month is "+ month + " bellow quy 2")
        7,8,9-> println("month is "+ month + " bellow quy 3")
        10,11,12-> {
            println("month is "+ month + " bellow quy 4")
        }
        else -> println("you have input true month")

    }
    // ngoai ra when con kiem tra bien voi mot vung du lieu lien tuc dung ap dung voi cac bai toan so khop
   /* Như vậy nếu các bạn muốn kiểm tra biến thuộc một vùng
            dữ liệu liên tục nào đó thì có thể dùng cú pháp ở trên,
    Tui thấy nó rất hay trong trường hợp này. Ta có thể áp dụng tốt vào các giải thuật so khớp.
    */

    var tuoi:Int= 0
    println("input year old")
    var n:String?= readLine()
    if(n != null)
        tuoi=n.toInt()
    when(tuoi){
        in 1..5-> println("you are children")
        in 5..16-> println("you are younger")
        in 16..40-> println("you will old as soon as")
        in 40..70-> println("you old")
        else-> println("I don't have veriabel to speaking with you")

    }

    // no cung tra ve bieu thuc ket qua
    var y:Int=8
    var kq=when(y)
    {
        in 1..10->y+100
        in 20..30->y-1000
        else -> y
    }
    println(kq)
    //  when có thể hoạt động như chuỗi biểu thức if-else if
    var x:Int=100
    when
    {
        x%2==0-> println("$x là số chẵn")
        x%2!=0->println("$x là số lẻ")
    }
    //
    var giatri:Int = 8
    var ketquagt=when(giatri){
        in 1..5->giatri + 100
        in 10..100-> giatri + 1000
        else -> giatri
    }
    println(giatri)



}