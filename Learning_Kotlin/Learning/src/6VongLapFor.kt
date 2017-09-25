fun main(args: Array<String>) {
    // có 5 cách thức hoạt động
    // duyệt tuần tự(closed range)
  var giatri:Int = 1
    var sophantu:Int= 5
    for(i in 1..5){
        giatri *= i
        giatri = giatri + 10
    }
    println("$sophantu != $giatri")
    // duyệt giá trị gần bằng n
    var sum:Int = 0
    var tongphantu:Int = 5
    for (i in 1 until  tongphantu){
        sum  += i
    }
    println("sum la + "+ sum)
    // laoi 3 điều hướng bước nhảy step cho phép nhảy với số bước nhất đinh
    // tính tổng chẵn
    var sumchan:Int = 0
    var tongphantuchan:Int = 10
    for(i in  2..tongphantuchan step 2){
        sumchan += i
    }
    println("sum chan la "+ sumchan)
    // direction with downto
    // tìm ước số chung lớn nhất
    var soa:Int = 9
    var sob:Int = 6
    var uscln:Int = 1

    var min=if(soa > sob) sob else soa
    for(i in min downTo  1){

        if (soa % i ==0 && sob % i == 0){
            uscln = i
            break
        }

    }
    println("ước chung lớn nhất " + uscln)

    // duyệt từng đối tượng trên một tập đối tượng
    var mangDienThoai= arrayOf("Apple","SamSung","Sony","Oppo","LC")
    for(i in mangDienThoai){
        println("sản phẩm tại vi trí $i"+i)

    }
    // duyệt theo vi trí
    for(index in mangDienThoai.indices){
        println("san pham thu $index  co ten la "+ mangDienThoai[index])
    }
    // vừa hỗ trợ lấy index và giá trị
    for ((index,value) in mangDienThoai.withIndex()){
        println("vị trí "+ index +"giá trị " + value)
    }

    // thuc hanh for





}