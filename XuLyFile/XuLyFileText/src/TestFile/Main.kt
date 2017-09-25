package TestFile

fun main(args: Array<String>) {
//
//    var data:MutableList<SanPham> = mutableListOf()
//    var sp1 =SanPham(1,"TraSua",10.0)
//    data.add(sp1)
//    var sp2 = SanPham(2,"trachanh",23.3)
//    data.add(sp2)
//    var sp3 = SanPham(3,"trada",32.2)
//    data.add(sp3)
//
//
//    // nhiem vu la luu file
//    var luufile= FileTextDirectory().LuuFile("d:/dulieusanpham.txt",data)
//    if(luufile == true){
//        println("luu file thanh cong")
//    }else{
//        println("luu file that bai")
//    }

    var data_Reader:MutableList<SanPham> =
            FileTextDirectory().DocFile("d:/dulieusanpham.txt")
    println("ket qua sau khi doc")
    for(sp in data_Reader)
        println(sp)


}