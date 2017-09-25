fun main(args: Array<String>) {
    var collection:MutableList<Int> = mutableListOf()
    collection.add(6)
    collection.add(7)
    collection.add(10)
    collection.add(2)
    collection.add(19)
    collection.addAll(mutableListOf(3,5,6))

    println("lay mot gia tri ra"+ collection.get(4))
    // tim kiem
    if(collection.contains(6)){
        println("number is found")
    }else
        println("number is not found "
        )
    // get value  by index
    // get gia tri boi index
    for (index in 0..collection.size-1)
            print(collection.get(index))
    println()


    // hien thi danh sach cac collection
    println("hien thi danh sach cac collection theo vi tri")
    for (i in collection.indices)
        print("${collection[i]}\t")
    println()

    println("hien thi danh sach theo gia tri")
    for (i in collection)
        print("$i\t")
    println()
    println("doi gia tri thu 2 thanh 100")
    collection[2]= 100
    for (i in collection)
        print("$i\t")
    println()

    println("xoa phan tu tai vi tri thu 3")
    collection.removeAt(3)
    for (vitri in collection.indices)
        print("${collection[vitri]}\t")
    println()

    println("sap xep collection tang dan")
    collection.sort()
    for (vitrisapxep in collection.indices)
        print("${collection[vitrisapxep]}\t")
    println()

    println("sap xep collection giam dan")
    collection.sortDescending()
    for (giamdan in collection.indices)
        print("${collection[giamdan]}\t")
    println()
    println("tong gia tri trong collection "+collection.sum())
    println("hieu gia tri trong collection "+collection.min())
    println("trung binh gia tri trong collection "+collection.average())

    println("tinh trung binh cac gia tri le trong collection")

    var giaitrile= collection.filter { x->x %2 ==1}
    for(i in giaitrile.indices)
        print("${giaitrile[i]}\t")
        println("\ngia tri trung binh "+giaitrile.average())
        println("gia tri lon nhat "+giaitrile.sum())
    println()

    println("tim cac phan tu la so nguyen to trong collection")
    var soNguyenTo=collection.filter {
        x->
         var dem = 0
        for(i in 1..x) {
            if (x % i == 0)
                dem++
        }
        dem == 2
    }

    println(" cac so la so nguyen to la")
    for (i in soNguyenTo.indices)
        print("${soNguyenTo[i]}\t0")
    println()






}