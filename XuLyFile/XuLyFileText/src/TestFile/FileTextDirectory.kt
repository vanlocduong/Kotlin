package TestFile

import java.io.*

class  FileTextDirectory{

    fun LuuFile(path:String,data:MutableList<SanPham>):Boolean{
        try {
            val fos= FileOutputStream(path)
            val osr= OutputStreamWriter(fos,"UTF-8")
            val bw= BufferedWriter(osr)
            for(i in data){
                bw.write(i.toString())
                bw.newLine()
            }
            bw.close()
            osr.close()
            fos.close()
            return true

        }
        catch (e:Exception)
        {
            e.printStackTrace()
        }


        return false
    }
    fun DocFile(path: String):MutableList<SanPham>{
        var data:MutableList<SanPham> = mutableListOf()
        try {

        val fis= FileInputStream(path)
        val isr= InputStreamReader(fis)
        val br= BufferedReader(isr)
            var line= br.readLine()

         while ( line != null){
             var arr=line.split("\t")
             if(arr.size == 3){
                 // khai bao san pham
                 var sp:SanPham = SanPham()
                 sp.ma =arr[0].toInt()
                 sp.ten=arr[1]
                 sp.gia=arr[2].toDouble()
                 data.add(sp)
             }
             line = br.readLine()

         }


        }catch (e:Exception){
            e.printStackTrace()
        }
        return data

    }

}

