class Triangle {
    var canhA:Double=0.0
    var canhB:Double=0.0
    var canhC:Double=0.0

    constructor()
    constructor(canhA :Double,canhB:Double,canhC:Double)
    {
        this.canhA = canhA
        this.canhB = canhB
        this.canhC = canhC

    }
    fun perimeter():Double{
        return (canhA+canhB+canhC)

    }
    fun triangleArea():Double{
        var p= perimeter()/2
        return Math.sqrt(p *(p-canhA) *(p-canhB) * (p-canhC) )
    }


}