fun main(args: Array<String>) {
    // khoi tao danh sach san pham
    var data:MutableList<SanPham> = mutableListOf()
    // add them du lieu tinh
    var sp1=SanPham(1,"laptop",100231.2)
    data.add(sp1)
    var sp2 = SanPham(2,"dienthoai",123.23)
    data.add(sp2)
    var sp3 = SanPham(3,"banphim",12312.23)
    data.add(sp3)
    // thuc hien luu file
    var luufile:Boolean= SerizableFileFactory().LuuFile("D:/luufile.dat",data)
    if(luufile ){
        println("da luu thanh cong")
    }else
        println("luu that bai")
    var ddocfile:MutableList<SanPham> = SerizableFileFactory().DocFile("D:/luufile.dat")
    for (sp in ddocfile)
        println(sp)


}