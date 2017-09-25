class  Product{
    var ma:Int = 0
    var ten:String=""
    var donGia:Double=0.0
    constructor()

    constructor(ma: Int, ten: String, donGia: Double) {
        this.ma = ma
        this.ten = ten
        this.donGia = donGia
    }

    override fun toString(): String {
        return "Product(ma=$ma, ten='$ten', donGia=$donGia)"
    }

}