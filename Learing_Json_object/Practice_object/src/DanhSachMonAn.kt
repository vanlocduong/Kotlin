class  DanhSachMonAn{
    var dataThemMonAn:MutableList<MonAn> = mutableListOf<MonAn>()
   var MaDanhSach:Int =0
    var TenDanhSacnh:String=""

    constructor(MaDanhSach: Int, TenDanhSacnh: String) {
        this.MaDanhSach = MaDanhSach
        this.TenDanhSacnh = TenDanhSacnh
    }
    constructor()

    override fun toString(): String {

        var  s= ""
        for(sp in dataThemMonAn)
            s+="\t" + sp.toString()+"\n"
        var infor="Danh Muc: "+MaDanhSach.toString()+ "\t" + TenDanhSacnh
        infor += "\n cac san pham cua danh muc nay: \n" + s

        return  infor


    }
    fun ThemMonAn(monAn: MonAn){
        dataThemMonAn.add(monAn)
    }
    fun XoaMonAn(monAn: MonAn){
        dataThemMonAn.remove(monAn)
    }

}