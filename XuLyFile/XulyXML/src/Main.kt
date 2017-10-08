fun main(args: Array<String>) {
    var data:MutableList<SanPham> = mutableListOf()
    var sp1=SanPham(1,"Coca cola",15.5)
    data.add(sp1)
    var sp2=SanPham(2,"Sting",25.0)
    data.add(sp2)
    var sp3=SanPham(3,"Redbull",17.0)
    data.add(sp3)
    var kqLuu= FileXMLFactory().LuuFile("d:/dulieusanpham.xml",data)
    if(kqLuu)
    {
        println("Lưu text file thành công")
    }
    else
    {
        println("Lưu text file thất bại")
    }
}
