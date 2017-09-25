import java.util.*

fun main(args: Array<String>) {
    var array:IntArray= IntArray(5)
    var rd =Random()
    for(i in array.indices)
        array[i] = rd.nextInt(100)
    println("sau khi nhap mang vi tri  la")
    for (i in array.indices)
        print("${array[i]}\t")
    println()
    println(" sau khi duyet mang voi gia tri la ")
    for (i in array)
        print("$i\t")
    println()

    // so lon nhat
    println("Max "+ array.max())
    // min
    println("Min "+array.min())
    // tinh trung binh
    println("Average "+array.average())
    // dem so chan
    println("So chan "+array.count { x->x %2== 0 })
    // dem so le
    println("So le "+ array.count{x ->x %2 ==1})
    // sap xep
    println("Sap xep tang dan")
    array.sort()
    for (i in array)
        print("$i\t")
    println()
    println("Sap xep giam dan")
    array.sortDescending()
    for (i in array)
        print("$i\t")
    println()
    // tim cac so le trong mang
    println("cac so chan trong mang")
    var dsSoChan=array.filter { x->x%2==0 }
    for(i in dsSoChan)
        print("$i\t")
    println()

    println("cac so le trong mang ")
    var dsSoLe=array.filter { x->x%2 == 1 }
    for (i in dsSoLe)
        print("$i \t")
    println()
    println("cac so lon hon 50")
    var k = 50
    var soLonHon50= array.filter { x-> x >k }
    for(i in soLonHon50)
        print("$i\t")
    println()


}