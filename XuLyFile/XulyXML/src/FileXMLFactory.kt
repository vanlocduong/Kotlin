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
    fun DocFile(path:String):MutableList<SanPham>
    {
        var data:MutableList<SanPham> = mutableListOf()
        try {
//Get the DOM Builder Factory
            val factory = DocumentBuilderFactory.newInstance()
//Get the DOM Builder
            val builder = factory.newDocumentBuilder()
//Load and Parse the XML document
//document contains the complete XML as a Tree.
            val xmlfile = File(path)
            val document = builder.parse(xmlfile)
//Iterating through the nodes and extracting the data.
            val nodeList = document.documentElement.childNodes

            for (i in 0..nodeList.length - 1) {

//We have encountered an <SanPham> tag.
                val node = nodeList.item(i)
                if (node is Element) {
                    val sp = SanPham()
                    val childNodes = node.getChildNodes()
                    for (j in 0..childNodes.getLength() - 1) {
                        val cNode = childNodes.item(j)

//Identifying the child tag of employee encountered.
                        if (cNode is Element) {
                            val content = cNode.getLastChild().getTextContent().trim()
                            when (cNode.getNodeName()) {
                                "Ma" -> sp.ma= content.toInt()
                                "Ten" -> sp.ten= content
                                "Gia" -> sp.gia= content.toDouble()
                            }
                        }
                    }
                    data.add(sp)
                }
            }
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return data
    }


}
