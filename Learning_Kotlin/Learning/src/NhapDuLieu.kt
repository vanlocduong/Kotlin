fun main(args: Array<String>) {
    println("moi ban nhap ten cua ban")

    println("what is your name ")
    //? allowed value with nullable
    var ten:String?= readLine()
    println("my name is + "+ ten)

    println("what is your name country ")
    var nameCountry:String?= readLine()
    println(nameCountry)

    println("where do you living ")
    var location: String?= readLine()
    println("The city I living is + "+ location)

    println("how old are you")
    var tuoi:String?= readLine()
    println("My years old is "+ tuoi)

    println("So I have the information Your Name " + ten

    +"and What is your name country you work "+
            nameCountry
    +"and where do you you live Is"+
            location
    +"years old of you " + tuoi
    +"thanks you for give me information for question "

    )

    // chuyen chuoi
    var chuoiInt:Int="12".toInt()

    var chuoiBoolean="true".toBoolean()

    var chuoiLong="02".toLong()
    println(chuoiInt)
    println(chuoiBoolean)
    println(chuoiLong)


}