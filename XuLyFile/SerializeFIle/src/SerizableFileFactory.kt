import com.sun.corba.se.pept.encoding.OutputObject
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class SerizableFileFactory {


    // vi kiem tra thanh cong hay khong nen dung biet boolean cho de
    fun LuuFile(path:String,data:MutableList<SanPham>):Boolean{

        try {
            val fos= FileOutputStream(path)
            val oos = ObjectOutputStream(fos)
            oos.writeObject(data)
            oos.close()
            fos.close()
            return true

        }catch (e:Exception){
            e.printStackTrace()
        }
        return false

    }
    // no tra ra la mot danh sach
    fun DocFile(path: String):MutableList<SanPham>{
        var data:MutableList<SanPham> = mutableListOf()
        try {
            val fis= FileInputStream(path)
            val ois= ObjectInputStream(fis)
           var obj = ois.readObject()
            data = obj as MutableList<SanPham>
            ois.close()
            fis.close()

        }catch (e:Exception){
            e.printStackTrace()
        }

        return  data
    }


}