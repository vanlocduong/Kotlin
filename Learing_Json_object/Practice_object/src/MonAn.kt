class MonAn {
    var MaMonAn:Int= 0
    var TenMonAn:String = ""
    var DonGia:Double= 0.0
    var MoTaMonAn:String= ""
    constructor()

    constructor(MaMonAn: Int, TenMonAn: String, DonGia: Double, MoTaMonAn: String) {
        this.MaMonAn = MaMonAn
        this.TenMonAn = TenMonAn
        this.DonGia = DonGia
        this.MoTaMonAn = MoTaMonAn
    }

    override fun toString(): String {
        return "MonAn(MaMonAn=$MaMonAn, TenMonAn='$TenMonAn', DonGia=$DonGia, MoTaMonAn='$MoTaMonAn')"
    }


}