import java.util.*

class SinhVien{
    private  var ma:Int= 0
    private  var ten:String =""
    private var namSinh:Date? = null
    public  var Ma:Int
        get() {return  ma}
        set(value) {ma= value}
    public  var Ten:String
        get() {return  ten}
        set(value) {ten= value}

    public var NamSinh:Date?
        get() = NamSinh
        set(value) {NamSinh=value}


    constructor(){
        println("this is the constructor no parameter")
    }
    constructor(ma:Int, ten:String,tuoi:Date){
        println("this is the constructor 2 parameter")
        println("Ma : $ma"+ " " + "Ten " + "$ten")
    }

    override fun toString(): String {
        return "SinhVien(ma=$ma, ten='$ten')"
    }
    fun  outputInfor(){
        println("information detail")
        println("Ma "+ ma)
        println("Ten "+ ten)


    }
    fun deTail():String{
        println("this is the end")
        var sString:String =""
        sString  = sString.plus("\n ma "+ ma)
        sString= sString.plus("\n ten "+ten)
        return  sString

    }


}