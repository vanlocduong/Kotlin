import java.util.*

/**
 * Created by cafe on 02/06/2017.
 */
fun SinhVien.Tuoi():Int
{
    var cal=Calendar.getInstance()
    var yearHienTai=cal.get(Calendar.YEAR)
    cal.time=this.NamSinh
    var yearNamSinh=cal.get(Calendar.YEAR)
    return yearHienTai-yearNamSinh+1
}
fun main(args: Array<String>) {
    var ns=Calendar.getInstance()
    ns.set(Calendar.YEAR,1998)
    ns.set(Calendar.MONTH,2)
    ns.set(Calendar.DAY_OF_MONTH,15)

    var teo=SinhVien(1,"Nguyễn Văn Tèo",ns.time)
    var tuoiCuaTeo=teo.Tuoi()
    println("Tuổi của Tèo="+tuoiCuaTeo)
}
