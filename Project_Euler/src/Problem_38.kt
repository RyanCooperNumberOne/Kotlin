fun isPan(x: Int): Boolean{
    var tt = true
    val str = x.toString()
    val mut: MutableList<Int?> = mutableListOf()
    for (i in str.indices){
        mut.add(str[i].toInt()-48)
    }
    for (i in 1..str.length){
        if (i !in mut){
            tt = false
            break
        }
    }
    return tt
}
fun main(args: Array<String>) {
    var t = 0
    for (i in 1..9999){
        var str = ""
        for (j in 1..9){
            str += (i*j).toString()
            if (str.length > 9){
                break
            }
            if (isPan(str.toInt()) && str.length <= 9 && t < str.toInt()){
                println("$str -> $i * 1..$j")
                t = str.toInt()
            }
        }
    }
}