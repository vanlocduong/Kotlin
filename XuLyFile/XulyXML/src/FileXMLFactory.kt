import java.io.File
import javax.xml.bind.Element
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

class  FileXMLFactory{


    fun LuuFile(path:String,data:MutableList<SanPham>):Boolean {
        try {
            var docFactory=DocumentBuilderFactory.newInstance()
            var docBuilder = docFactory.newDocumentBuilder()
            var doc = docBuilder.newDocument()
            val rootElement = doc.createElement("SanPham")
            for(sp in data){
                val sanPhamElement = doc.createElement("SanPham")
                val maElement = doc.createElement("ma")
                sanPhamElement.appendChild(maElement)
                maElement.textContent= sp.ma.toString()
                val tenElement = doc.createElement("ten")
                tenElement.textContent= sp.ten.toString()
                sanPhamElement.appendChild(tenElement)
                val giaElement = doc.createElement("gia")
                giaElement.textContent = sp.gia.toString()
                sanPhamElement.appendChild(giaElement)

                rootElement.appendChild(sanPhamElement)

            }

            var tranfomerFactory = TransformerFactory.newInstance()
            val transformer = tranfomerFactory.newTransformer()
            var source = DOMSource(doc)
            val result = StreamResult(File(path).absolutePath)

            transformer.transform(source,result)
            return true

        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }
    fun docFile(path:String):MutableList<SanPham>{
        var data:MutableList<SanPham> = mutableListOf()
        try {
            val factory= DocumentBuilderFactory.newInstance()
            val builder = factory.newDocumentBuilder()
            val xmlfile= File(path)
            val document = builder.parse(xmlfile)
            val nodeList= document.documentElement.childNodes
            for(i in 0..nodeList.length-1){
                val node = nodeList.item(i)
                if(node is Element){
                    val sp = SanPham()
                    
                }

            }



        }
        catch (e:Exception){
            e.printStackTrace()
        }
        return data
    }

}
