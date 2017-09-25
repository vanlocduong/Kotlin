import java.io.*

class TextFileFactory {

    fun LuuFile(data:MutableList<Product>,path:String): Boolean {
        try {


        val fos= FileOutputStream(path)
        val osw = OutputStreamWriter(fos,"UTF-8")
        val bw = BufferedWriter(osw)
        for(sp in data){
            bw.write(sp.toString())
            bw.newLine()

        }
        bw.close()

        osw.close()
        fos.close()

        return true
        }catch (ex:Exception){
            ex.printStackTrace()
        }
        return false

    }

    fun DocFile(path:String):MutableList<Product>{
        // thong qua ham mutablelistof de khoi tao
        var data:MutableList<Product> = mutableListOf()
        try {
            val  fis= FileInputStream(path)
            val   isr= InputStreamReader(fis,"UTF-8")
            val br= BufferedReader(isr)
            var line = br.readLine()
            while (line != null){
                var arr= line.split("\t")
                if(arr.size == 3){
                    var sp:Product = Product()
                    sp.ma = arr[0].toInt()
                    sp.ten = arr[1]
                    sp.donGia= arr[2].toDouble()

                    data.add(sp)
                }
                line = br.readLine()


            }
            br.close()
            isr.close()
            fis.close()
        }catch (Ex:Exception){
            Ex.printStackTrace()
        }
        return  data
    }
}
