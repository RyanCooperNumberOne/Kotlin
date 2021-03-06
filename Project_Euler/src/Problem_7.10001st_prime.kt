/*
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
* we can see that the 6th prime is 13.
* What is the 10 001st prime number?
* */

import kotlin.math.sqrt

fun main() {
    var sequenceNumber = 2
    var primeNumber = 2
    while (sequenceNumber != 10001) {
        primeNumber++
        var divider = 2
        val rootOfPrimeNumber = sqrt(primeNumber.toFloat())
        while (primeNumber % divider != 0 && divider <= rootOfPrimeNumber) {
            divider++
            if (divider > rootOfPrimeNumber) {
                sequenceNumber++
            }
        }
    }
    println("$sequenceNumber -> $primeNumber")
}