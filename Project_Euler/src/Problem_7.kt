import kotlin.math.sqrt
fun prByNum(x: Int): Int{
    var k = 2
    var i = 2
    while (k!=x && x>2){
        i++
        var t = 2
        val sq = sqrt(i.toFloat())
        while (i%t!=0 && t<=sq){
            t++
            if (t>sq){
                k++
            }
        }
    }
    if (x==2){
        i = 3
    }
    if (x<1){
        i = 0
        println("Вы неправильно ввели номер числа для функции prByNum, функция вернула 0")
    }
    return i
}
fun main(){
    var k = 2
    var i = 2
    while (k != 10001){
        i++
        var t = 2
        val sq = sqrt(i.toFloat())
        while (i%t!=0 && t<=sq){
            t++
            if (t>sq){
                k++
            }
        }
    }
    println("$k -> $i")
    println(prByNum(10001))
}