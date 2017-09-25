import java.util.*

fun main(args: Array<String>) {
    // khoi tao mang random vs kotlin
    var arr:IntArray= IntArray(5)
    var rd =Random()
    for (i in arr.indices)
        arr[i] = rd.nextInt(100)

    println("danh sach mang the vi tri ")
    for(i in arr)
        print("$i\t")
    println()

    println("danh sach mang theo gia tri va vi tri ")
    for(i in arr.indices)
        print( "${arr[i]}\t"+ "vitri $i\t")
    println()
    // tinh tong

    println("tong "+arr.sum())
    // max
    println("max "+ arr.max())
    // min
    println("min "+ arr.min())
    println("size "+ arr.size)
    println("trung binh "+arr.average())
    println("chan "+ arr.count{x -> x %2 == 0})
    println("le "+ arr.count{x -> x %2 == 1})
    // sap xep
    println("sap xep tang dan ")
    arr.sort()
    for(i in arr)
        print("$i\t")
    println()
    println("sap xep giam dan ")
    arr.sortDescending()
    for (i in arr)
        print("$i \t")
    println()
   println(" cac so chan trong mang ")
   var dsChan= arr.filter { x-> x %2 ==0 }
    for (i in dsChan)
        print("$i \t")
    println()
    println("cac so le trong mang ")
    var dsLe= arr.filter { x-> x %2 == 1 }
    for (i in dsLe)
        print("$i\t")
    println()
    println("cac so nho hon 20")
    var k = 20
    var soNhoHon20 =arr.filter { x-> x < k }
    for (i in soNhoHon20)
        print("$i \t")
    println()
    println("so lon hon 70")
    var l = 70
    var soLonHon70= arr.filter { x->x > l }
    for (i in soLonHon70)
        print("$i \t")
    println()







}