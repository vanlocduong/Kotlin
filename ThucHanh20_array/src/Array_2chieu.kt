import java.util.*

fun main(args: Array<String>) {
    var arr:Array<IntArray> = Array(5,{IntArray(5)})

    var mang:Array<FloatArray> = Array(5,{FloatArray(5)})

    var rd=Random()
    for(i in arr.indices) {
        for (j in arr[i].indices) {
            arr[i][j] = rd.nextInt(100)
        }
        println()
    }


    println("sau khi in ket qua la")
    for(i in arr.indices) {
        for (j in arr[i].indices) {
            print("${arr[i][j]}\t")
        }
        println()
    }

    println("sau khi nhap mang cach thu 2")
    for(row in arr) {
        for (cell in row) {
            print("$cell\t")
        }
        println()
    }
    println("in ra mang thu 2 la ")

    var arr1 = arr[2]
    for(y in arr1.indices) {
        print("${arr1[y]}\t")
    }
    println()


    println("in ra hang ngang thu 3")
    var hangngan= arr[3]
    for (inhangngang in hangngan.indices)
        print("${hangngan[inhangngang]}\t")
    println()

    println("xuat ra mang 2 chieu ")
    for(i in arr.indices)
    {
        for (j in arr[i].indices){
            print("${arr[i][j]}\t")
        }
        println()
    }
    println("xuat ra mang 2 chieu cach 2")
    for (row in arr)
    {
        for(collum in row)
            print("${collum}\t")
        println()

    }





}