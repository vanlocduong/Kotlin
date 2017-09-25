fun main(args: Array<String>) {
    /* OOP
    1
    var triangle1 = Triangle(3.0,4.0,6.0)
    println("chu vi tam giac "+ triangle1.perimeter())
    println("dien tich tam giac "+triangle1.triangleArea())

    var triangle2= Triangle()
    triangle2.canhA = 6.0
    triangle2.canhB = 8.0
    triangle2.canhC= 12.0
    println("chu vi tam giac 2 "+ triangle2.perimeter())
    println("dien tich tam giac 2 "+ triangle2.triangleArea())
    */
    var loc =NhanVienChinhThuc()
    var hoangdung=NhanVienThoiVu()

    var luongLoc=loc.pensionForEmployee(20)
    println("Pension of employee VanLoc "+luongLoc)

    var luongHoangDung= hoangdung.pensionForEmployee(25)
    println("Pension of employee HoangDung "+luongHoangDung)

}