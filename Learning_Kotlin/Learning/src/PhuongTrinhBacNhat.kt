fun main(args: Array<String>) {

    // phuong trinh bac nhat ax + b = 0
     // if a = 0 phuong trinh vo so nghiem
    // if b = 0 phuong trinh vo nghiem
    // x = -b/a
    var a:Double=0.0
    var b:Double=0.0
    println("input the value a")
    var s = readLine()
    if(s != null)
        a=s.toDouble()
    println("input the value b")
    s = readLine()
    if(s != null)
        b=s.toDouble()

    if(a ==0.0 && b ==0.0)
        println("phuong trinh vo so nghiem")
    else if(a== 0.0 && b != 0.0)
        println("phuong trinh vo nghiem")
    else
    {
        var ketqua=-b/a
        println("ket qua la "+ ketqua)

    }
    // tinh diem trung binh
    var diemtrungbinh:Double=0.0
    println("nhap vao diem trung binh")
    var diem:String?= readLine()
    if(diem !=null){
        diemtrungbinh= diem.toDouble()
        if(diemtrungbinh > 9)
            println("you are the best the student in the world")
        else if(diemtrungbinh > 7)
            println("in the world have in intelligence")
        else
            println("you have stupid")



    }
// cach viet theo kieu Kotlinm trong Kotlin đó là nó hoạt động như một biểu thức trả về kết quả:
    // luu y no phai co else
    // ngoai ra dong lenh cuoi cung trong moi block chinh la ket qua tra ve
    // example calculate everage number a and number b
    var numbera:Int=5
    var numberb:Int=6
    var ketqua:Int

    ketqua=if(numbera > numberb) numbera else numberb
    println("so lon nhat "+ ketqua)
    //example
    var choosea:Int= 8
    var chooseb:Int= 9
    var max=if(choosea > chooseb)
    {
        println("you are choose a")
        choosea

    }else {
        println("you decided b")
        chooseb
    }
    println("so lon nhat ban cho la  "+ max)






}