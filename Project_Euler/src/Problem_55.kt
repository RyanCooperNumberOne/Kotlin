fun isPal(x: Long): Boolean{
    var pal = true
    var k = ""
    val z = x.toString()
    for (i in z.length - 1 downTo 0){
        k += z[i]
    }
    if (k != z){
        pal = false
    }
    return pal
}
fun slozh(x: Long): Long {
    var k = ""
    val z = x.toString()
    for (i in z.length - 1 downTo 0) {
        k += z[i]
    }
    return k.toLong() + x
}
fun perSlStr(x: String): String{
    var k = ""
    for (i in x.length-1 downTo 0){
        k += x[i]
    }
    var fin = ""
    var sh = 0
    for (i in x.length-1 downTo 0){
        val p = x[i].toInt() + k[i].toInt() - 96 + sh
        var j = p.toString()
        if (p >= 10){
            sh = 1
            j = j[1].toString()
        }else{
            sh = 0
        }
        fin += j
    }
    if (sh == 1){
        fin += "1"
    }
    k = ""
    for (i in fin.length-1 downTo 0){
        k += fin[i]
    }
    return k
}
fun isPalStr(x: String): Boolean{
    var pal = true
    var k = ""
    for (i in x.length-1 downTo 0){
        k += x[i]
    }
    if (k != x){
        pal = false
    }
    return pal
}
fun main(){
    println(slozh(123)) //функция сложения числа и его перевернутого значения
    println(isPal(1992)) //функция, которое проверяет, является ли число палиндромом
    var sum = 0
    for (i in 1..10000){
        var kot = i.toString()
        var ij = 1
        while (!isPalStr(kot) && ij!=50 || ij==1){ // сначала была ошибка, когда не было ij==1,
            // так как некоторые числа изначально палиндромы
            //println("$ij -> $kot")
            kot = perSlStr(kot)
            ij++

        }
        if (ij == 50){
            sum++
            //println("$i -> $ij -> $kot") // эта строчка нужна для проверки самого себя, правильно ли работает функция
        }
    }
    println("Ответ: $sum")
}