fun main(arg: Array<String>) {
//    var data:MutableList<Product> = mutableListOf()
//    var sp1 =Product(1,"TraSua",10.0)
//    data.add(sp1)
//    var sp2 =Product(2,"TraChanh",199.0)
//    data.add(sp2)
//    var sp3= Product(3,"TraDa",120.2)
//    data.add(sp3)
//    var ketqualuu =TextFileFactory().LuuFile(data,"D:\\Kotlin\\Project\\XuLyFile\\dulieusanpham.txt")
//    if(ketqualuu == true){
//        println("luu thanh cong ")
//
//    }else{
//        println("luu that bai ")
//    }

    var data_Reader:MutableList<Product> =
            TextFileFactory().DocFile("D:\\Kotlin\\Project\\XuLyFile\\dulieusanpham.txt")
    println("ket qua sau khi doc")
    for(sp in data_Reader)
        println(sp)
    var data:MutableList<Product> =
            TextFileFactory().DocFile("D:\\Kotlin\\Project\\XuLyFile\\dulieusanpham.txt")
    for (sp in data)
        println(sp)


}