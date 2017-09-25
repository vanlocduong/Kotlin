 class NhanVienChinhThuc:NhanVien() {
    override fun pensionForEmployee(dayCong: Int): Double {
        if(dayCong>=22)
            return 10000000.0
        return 10000000.0-500000*(22-dayCong)


    }
}