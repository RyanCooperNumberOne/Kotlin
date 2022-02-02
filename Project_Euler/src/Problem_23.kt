fun isIzo(x: Int): Boolean{
    var bool = false
    var t = 0
    for (i in 1 until x){
        if (x % i == 0){
            t += i
        }
    }
    if (t > x){
            bool = true
    }
    return bool
}
fun isSum2(x: Int, y: MutableList<Int>): Boolean{
    var bool = false
    for (i in 0 until y.size){
        val j = x - y[i]
        if (j <= 0){
            break
        }
        if (isIzo(j)){
            bool = true
            break
        }
    }
    return bool
}
fun main(args: Array<String>) {
    val range = 1..28123
    val mut: MutableList<Int> = mutableListOf()
    for (i in range){
        if (isIzo(i)){
            mut.add(i)
        }
    }
    val mut2: MutableList<Int> = mutableListOf()
    for (i in range){
        if (!isSum2(i, mut)){
            mut2.add(i)
            println(i)
        }
    }
    val sum = mut2.sum()
    println(sum)
}




//fun isSumOfIzo(x: Int): Boolean{
//    var bool = false
//    for (i in 1..x){
//        val j = x - i
//        if (isIzo(i) && isIzo(j)){
//            bool = true
//            break
//        }
//    }
//    return bool
//}