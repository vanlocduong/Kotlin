import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.FileReader
import java.io.FileWriter
import java.security.cert.CertPath

class JSonFactory{
    fun LuuFile(data:MutableList<DanhMuc>,path:String):Boolean {
        try {
            val gson= Gson()
            val file =FileWriter(path)
            gson.toJson(data,file)
            file.close()

            return  true

        }catch (e:Exception){
            e.printStackTrace()
        }
        return  false
    }
    // doc file phai luu vao data mang
    fun DocFile(path: String):MutableList<DanhMuc>{
        var data: MutableList<DanhMuc> = mutableListOf()
        try {

            val gson = Gson()
            var fileRead = FileReader(path)
            data = gson.fromJson<MutableList<DanhMuc>>(fileRead,
                    object : TypeToken<MutableList<DanhMuc>>() {

                    }.type
            )
            fileRead.close()
        }

        catch (e:Exception){
            e.printStackTrace()
        }
        return data
    }
}