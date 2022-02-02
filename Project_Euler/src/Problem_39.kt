fun res(x: Int): Int{
    var r = 0
    for (i in 1..x){
        loop@for (j in i..x-i){
            for (k in j..x-i-j){
                if (k*k == (j*j + i*i) && (i+j+k) == x){
                    r++
                    break@loop
                }
            }
        }
    }
    return r
}
fun main(args: Array<String>){
    var t = 0
    for (i in 1..1000){
        if (t < res(i)){
            println("$i -> ${res(i)}")
            t = res(i)
        }
    }
}