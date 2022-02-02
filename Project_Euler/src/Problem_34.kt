fun main(args: Array<String>){
    var sm = 0
    for (i in 3..10000000){
        var ss = 0L
        val d = i.toString()
        for(char in d){
            var sum1 = 1L
            val s = char.toShort() - 48
            for (j in 1..s){
                sum1 *= j
            }
            ss += sum1
        }
        if (ss.toInt() == i){
            sm += i
        }
    }
    println("sum -> $sm")
}

//    for (i in 1..20){
//        var sum = 1L
//        for (j in 1..i){
//            sum *= j
//        }
//        println(sum)
//    }