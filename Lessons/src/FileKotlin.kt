fun ste(x: Int, y: Int): Int{
    var xx = x
    for (i in 2..y){
        xx *= x
    }
    return xx
}
fun fib(x: Int): Int{
    var n1 = 0
    var n2 = 1
    for (i in 1..x){
        val n3 = n1 + n2
        n1 = n2
        n2 = n3
    }
    return n1
}
fun pe(iz: Int, v: Int, ch: Int): Int{
    val m = 0
    if (iz == 2 && v == 10){
        print("Hello")
    }

    return m
}
fun main(args: Array<String>){
    for (i in 1..10){
        println(i*2)
        //val ii = i * 2
        //print("$ii ")
        }
    println(ste(3, 5))
    print(fib(500))
}
