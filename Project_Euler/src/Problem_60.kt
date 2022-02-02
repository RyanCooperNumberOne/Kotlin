import kotlin.math.sqrt
fun isPr(x: Int): Boolean{
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
fun co(x: Int, y: Int): Int{
    val xy = x.toString() + y.toString()
    return xy.toInt()
}
fun main(args: Array<String>){
    val x = 10000
    val mut = mutableListOf(3)
    for (i in 7..x){
        if (isPr(i)){
            mut.add(i)
        }
    }
    for (i in mut) {
        for (j in mut) {
            if (!isPr(co(i,j)) || !isPr(co(j,i))) {
                continue
            }
            for (k in mut) {
                val ik = (co(i,k))
                val kj = (co(k,j))
                val ki = (co(k,i))
                val jk = (co(j,k))
                if (!isPr(kj) || !isPr(ki) || !isPr(jk) || !isPr(ik)) {
                    continue
                }
                for (l in mut) {
                    val il = (co(i,l))
                    val jl = (co(j,l))
                    val lj = (co(l,j))
                    val li = (co(l,i))
                    val lk = (co(l,k))
                    val kl = (co(k,l))
                    if (!isPr(lj) || !isPr(li) || !isPr(lk) || !isPr(il) || !isPr(kl) || !isPr(jl)) {
                        continue
                    }
                    for (o in mut) {
                        val io = (co(i,o))
                        val jo = (co(j,o))
                        val ko = (co(k,o))
                        val lo = (co(l,o))
                        val oj = (co(o,j))
                        val oi = (co(o,i))
                        val ok = (co(o,k))
                        val ol = (co(o,l))
                        if (!isPr(oj) || !isPr(oi) || !isPr(ok) || !isPr(ol) || !isPr(ko) || !isPr(jo) || !isPr(lo) || !isPr(io)) {
                            continue
                        }
                        val sum = i + j + k + l + o
                        println("$i, $j, $k, $l, $o -> $sum")
                    }
                }
            }
        }
    }
}
