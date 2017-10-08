fun main(args: Array<String>) {
    var data:MutableList<SanPham> = mutableListOf()
    var sp1 = SanPham(12,"che",0.9)
    data.add(sp1)

    var sp2 = SanPham(11,"tra",0.9)
    data.add(sp1)

    var sp3 = SanPham(13,"sua",0.9)
    data.add(sp1)

    var luufile =JsonFileFactory().LuuFile("D:/Kotlin/Project/Kotlin/LearningJson/luufile.json",data)
    if(luufile){
        println("in thanh cong ")
    }else
        println("in that bai")

    var data1:MutableList<SanPham> = JsonFileFactory().DocFile("D:/Kotlin/Project/Kotlin/LearningJson/luufile.json")
    for (sp in data1)
        println(sp)

}