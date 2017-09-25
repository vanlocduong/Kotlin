fun main(args: Array<String>) {
    var hashmap = HashMap<Int, String>()
    hashmap.put(1,"duong van loc")
    hashmap.put(2,"hoan van thai")
    hashmap.put(3,"get all")
    println(hashmap.get(3))
    for (index in hashmap.keys)
        println("get map "+ hashmap.get(index))
}