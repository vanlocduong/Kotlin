fun main(args: Array<String>) {
    var a= 7
    if(a.checkNguyenTo()== true)
        println("la so nguyen to ")
    else
        println("khong la so nguyen to ")
    var b=9
    if(b.checkNguyenTo()==true)
    {
        println("$b là số nguyên tố")
    }
    else
    {
        println("$b Ko là số nguyên tố")
    }


}
fun Int.checkNguyenTo():Boolean{
    var dem = 0
    for (i in 1 .. this)
    {
        if(this %i == 0)
            dem ++
    }
   return dem == 2

}