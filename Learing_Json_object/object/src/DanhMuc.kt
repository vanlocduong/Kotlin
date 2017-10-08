class DanhMuc {
    var MaDanhMuc:Int = 0
    var TenDanhMuc:String = ""
    var sanPham:MutableList<SanPham> = mutableListOf()

    constructor(MaDanhMuc: Int, TenDanhMuc: String) {
        this.MaDanhMuc = MaDanhMuc
        this.TenDanhMuc = TenDanhMuc
    }
    constructor()

    override fun toString(): String {


        var s=""
        for (sp in sanPham)
            s+="\t"+sp.toString() + "\n"
        var infor="Danh Mục:["+MaDanhMuc.toString()+ "\t"+TenDanhMuc+"]"
        infor+="\nCác Sản phẩm của danh Mục này là:\n"+s
        return infor


    }
    fun ThemSanPham(sp:SanPham){
        sanPham.add(sp)

    }

}