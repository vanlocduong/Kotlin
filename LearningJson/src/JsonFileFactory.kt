import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.FileReader
import java.io.FileWriter

class JsonFileFactory{

    fun LuuFile(path:String,data:MutableList<SanPham>):Boolean {
        // can co 2 cai la data, duong dan
        try {
            val gson = Gson()
            val file=FileWriter(path)

            gson.toJson(data,file)
            file.close()
            return  true

        }catch (e:Exception){
            e.printStackTrace()
        }
        return false


    }
    fun DocFile(path: String):MutableList<SanPham>{

        var data:MutableList<SanPham> = mutableListOf()

        try {
            val  gson = Gson()
            val  file=FileReader(path)

            gson.fromJson<MutableList<SanPham>>(
                    file,
                    object :TypeToken<MutableList<SanPham>>(){

                    }.type
            )
            file.close()
        }catch (e:Exception){
            e.printStackTrace()
        }
        return data
    }
}

