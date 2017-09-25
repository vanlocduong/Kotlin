fun main(args: Array<String>) {
    var n: Int = 0
    var s: String?
    println("Chào mừng đến với Chương trình kiểm tra số Nguyên Tố")
    while (true) {
        println("Nhập số nguyên:")
        s = readLine()
        if (s != null)
            n = s.toInt()
        var dem: Int = 0
        for (i in 1..n) {
            if (n % i == 0)
                dem++
        }
        if (dem == 2)
            println("$n là số nguyên tố")
        else
            println("$n ko phải là số nguyên tố")
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    }
    println("Chào tạm biệt")

    var m:Int = 5
    var gt:Int=1
    var i:Int = 1
    do
    {
        gt *= i
        i++
    }while (i<=m)
    println("$n! =$gt")

}
