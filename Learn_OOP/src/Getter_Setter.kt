fun main(args: Array<String>) {
    // xuat thong tin cua vanloc
    var vanLoc = SinhVien()
    vanLoc.Ma = 120
    vanLoc.Ten = "VanLocDuong"
    println()


    println("thong tin cua "+vanLoc.Ten +" co ma la "+ vanLoc.Ma +" xem ")
    println(" call method outputInfo ")
    vanLoc.outputInfor()
    println()

    println("thong tin chi tiet la "+ vanLoc.deTail())

}