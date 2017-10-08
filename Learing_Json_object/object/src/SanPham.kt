class SanPham {
    var MaSanPham:Int = 0
    var TenSanPham:String = ""
    var DonGia:Double = 0.0

    constructor(MaSanPham: Int, TenSanPham: String, DonGia: Double) {
        this.MaSanPham = MaSanPham
        this.TenSanPham = TenSanPham
        this.DonGia = DonGia
    }


    override fun toString(): String {
        return "SanPham(MaSanPham=$MaSanPham, TenSanPham='$TenSanPham', DonGia=$DonGia)"
    }


}