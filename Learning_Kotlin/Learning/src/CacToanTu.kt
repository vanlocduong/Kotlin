fun main(args: Array<String>) {
    var x:Int= -8
    var y=x.unaryPlus()
    var z=y.unaryMinus()
    println("x "+ x)
    println("y "+ y)
    println("z "+ z)
/*
    •	Bước 1: Ưu tiên xử lý Prefix trước (các ++ hay — đặt trước biến)
    •	Bước 2: Tính toán các phép toán còn lại trong biểu thức
    •	Bước 3: Gán giá trị ở bước 2 cho biến lưu trữ kết quả ở bên trái dấu bằng
    •	Bước 4: Xử lý Post fix (các ++ hay — đặt sau biến)
*/
    var a:Int=5
    var b:Int=8
    var c:Int=2
    a--
    b++
    var ketqua=a++ + ++b - --c + 7
    var ketqua2=a ++ + b
    println("a="+a)
    println("b="+b)
    println("c="+c)
    println("z="+ketqua)
    println("ketqua 2 +" + ketqua2)

}