import kotlin.math.sqrt

/*
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
* we can see that the 6th prime is 13.
* What is the 10 001st prime number?
* */

fun main() {
    var sequenceNumber = 2
    var primeNumber = 2
    while (sequenceNumber != 10001){
        primeNumber++
        var t = 2
        val rootOfPrimeNumber = sqrt(primeNumber.toFloat())
        while (primeNumber%t!=0 && t<=rootOfPrimeNumber){
            t++
            if (t>rootOfPrimeNumber){
                sequenceNumber++
            }
        }
    }
    println("$sequenceNumber -> $primeNumber")
}