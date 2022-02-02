fun main(args: Array<String>){
    var t = ""
    var umnoj = 1
    var j = 1
    for (i in 0..200000){
        i.toString()
        t += i
    }
    while (j != 1000000){
        j *= 10
        umnoj *= t[j].toInt() - 48
    }
    print(umnoj)
}