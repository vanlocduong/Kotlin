import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.FileReader
import java.io.FileWriter

class JsonFactory{
    fun LuuFileJSon(path:String,data:MutableList<DanhSachMonAn>):Boolean{

        try {
            val gson = Gson()
            val file = FileWriter(path)
            gson.toJson(data,file)

            file.close()
            return true

        }catch (e:Exception){
            e.printStackTrace()
        }
        return false
    }
    fun DocFileJSon(path: String):MutableList<DanhSachMonAn>{
        var data:MutableList<DanhSachMonAn> = mutableListOf<DanhSachMonAn>()
        try {
            var gson = Gson()
            var fileReader = FileReader(path)
            data=gson.fromJson<MutableList<DanhSachMonAn>>(fileReader,
                    object:TypeToken<MutableList<DanhSachMonAn>>() {

                    }.type
            )
            fileReader.close()


        }catch (e:Exception){
            e.printStackTrace()
        }
        return  data
    }
}