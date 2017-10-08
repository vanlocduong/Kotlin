fun main(args: Array<String>) {
    var data:MutableList<DanhMuc> = mutableListOf<DanhMuc>()

    var dmDienTu:DanhMuc= DanhMuc(1,"Mat hang dien tu ")
    data.add(dmDienTu)
    var bongden:SanPham = SanPham(1,"bong den neon",23.000)
    dmDienTu.ThemSanPham(bongden)
    var binhacquy:SanPham = SanPham(2,"loai binh acquy xe may",500.00)
    dmDienTu.ThemSanPham(binhacquy)

    var dmQuanAo:DanhMuc = DanhMuc(2,"Danh muc mat hang ac quan")
    data.add(dmQuanAo)

    var quanJean:SanPham = SanPham(2,"QuanJean",100.00)
    dmQuanAo.ThemSanPham(quanJean)

    var aoSoMi:SanPham= SanPham(3,"Ao So Mi ",100.2)
    dmQuanAo.ThemSanPham(aoSoMi)

    var quanTay:SanPham = SanPham(3,"quan tay",87.00)
    dmQuanAo.ThemSanPham(quanTay)

    for (dm in  data)
    {
        println(dm)
    }
    var kqLuu= JSonFactory().LuuFile(data,"D:/Kotlin/Project/Kotlin/Learing_Json_object/object/danhmucsanpham.json")
    if(kqLuu)
        println("luu thanh cong vao csdl ")
    else
        println("luu that bai ")

    var database:MutableList<DanhMuc> =
            JSonFactory().DocFile("D:/Kotlin/Project/Kotlin/Learing_Json_object/object/danhmucsanpham.json")
    for (dm in database)
        println(dm)

}