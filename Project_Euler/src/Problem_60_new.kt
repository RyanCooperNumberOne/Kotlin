import kotlin.math.sqrt
fun isPr1(x: Int): Boolean{
    var te = false
    var t = 2
    val sq = sqrt(x.toFloat())
    while (x%t!=0 && t<=sq){
        t++
        if (t>sq){
            te = true
        }
    }
    if (x==3 || x==2){
        te = true
    }
    return te
}
fun co1(x: Int, y: Int): Int{
    return (x.toString() + y.toString()).toInt()
}
fun isPrCo(x: Int, y: Int): Boolean{
    var tr = false
    val xy = co1(x, y)
    val yx = co1(y, x)
    if (isPr1(xy) && isPr1(yx)){
        tr = true
    }
    return tr
}
fun main(args: Array<String>){
    val x = 10000
    val mut = mutableListOf(3)
    for (i in 7..x){
        if (isPr1(i)){
            mut.add(i)
        }
    }
    loop@for (i in mut) {
        for (j in mut) {
            if (!isPrCo(i,j)) {
                continue
            }
            for (k in mut) {
                if (!isPrCo(i,k) || !isPrCo(j,k)) {
                    continue
                }
                for (l in mut) {
                    if (!isPrCo(i,l) || !isPrCo(j,l) || !isPrCo(k,l)) {
                        continue
                    }
                    for (o in mut) {
                        if (!isPrCo(i,o) || !isPrCo(j,o) || !isPrCo(k,o) || !isPrCo(l,o)) {
                            continue
                        }
                        val sum = i + j + k + l + o
                        println("$i, $j, $k, $l, $o -> $sum")
                        break@loop
                    }
                }
            }
        }
    }
}