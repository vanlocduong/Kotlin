class Item {
    var type:String= ""
    var imageurl:String=""
    var muatienmat:String=""
    var muack:String=""
    var bantienmat:String=""
    var banck:String=""


    constructor(type: String, imageurl: String, muatienmat: String, muack: String, bantienmat: String, banck: String) {
        this.type = type
        this.imageurl = imageurl
        this.muatienmat = muatienmat
        this.muack = muack
        this.bantienmat = bantienmat
        this.banck = banck
    }
    constructor()

    override fun toString(): String {
        return "Item(type='$type'," +
                " imageurl='$imageurl'," +
                " muatienmat='$muatienmat'," +
                " muack='$muack', bantienmat='$bantienmat', banck='$banck')"
    }

}