import kotlin.math.pow
fun main(args: Array<String>) {
    var sum_of = 0
    for(i in 1..19L){
        for(j in 1..19){
            val number = i.toFloat().pow(j).toLong()
            val len = number.toString().length
            if (len == j){
                println("$number $len")
                sum_of ++
            }
        }
    }
    println(sum_of)
}