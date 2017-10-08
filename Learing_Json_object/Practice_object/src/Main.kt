fun main(args: Array<String>) {
    var dataMonAn:MutableList<DanhSachMonAn> = mutableListOf<DanhSachMonAn>()
    var dmMonXao:DanhSachMonAn= DanhSachMonAn(1,"Danh Muc Mon Xao")
    dataMonAn.add(dmMonXao)
    var dmMonChien:DanhSachMonAn= DanhSachMonAn(2,"Danh Muc Mon Chien ")
    dataMonAn.add(dmMonChien)
    var dmMonLau:DanhSachMonAn= DanhSachMonAn(3,"Danh Muc Mon Lau")
    dataMonAn.add(dmMonLau)
    var dmTatCa:DanhSachMonAn= DanhSachMonAn(4,"Tat Ca Dang Much Mon An ")
    dataMonAn.add(dmTatCa)

    var monXaoRauThit:MonAn = MonAn(1,"Rau Xao Thit",20000.0,"mon ngon xao ")
    dmMonXao.ThemMonAn(monXaoRauThit)

    var monComChien:MonAn = MonAn(2,"Mon com chien ",10000.0,"mon com chien hao hang")
    dmMonChien.ThemMonAn(monComChien)

    var monLauThai:MonAn = MonAn(3,"Mon Lau Thai ", 3999.0,"lau thai rat ngon")
    dmMonLau.ThemMonAn(monLauThai)

    var monHonHop:MonAn = MonAn(4,"mon tat cac ",50004.0,"tat ca mon an trong mot")
    dmTatCa.ThemMonAn(monHonHop)

    for (inmonan in dataMonAn){
        println(inmonan)
    }
    var kqLuu = JsonFactory().LuuFileJSon("D:/Kotlin/Project/Kotlin/Learing_Json_object/Practice_object/luudanhsachmonan.json",dataMonAn)
    if (kqLuu)
        println("luu thanh cong vao csdl")
    else
        println("chua luu thanh cong ")

    var databaseOpen =JsonFactory().DocFileJSon("D:/Kotlin/Project/Kotlin/Learing_Json_object/Practice_object/luudanhsachmonan.json")
    for( insp in databaseOpen)
        println(insp)

}