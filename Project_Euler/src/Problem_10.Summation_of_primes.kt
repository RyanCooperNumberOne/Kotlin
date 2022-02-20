/*
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* Find the sum of all the primes below two million.
* */

fun main() {
    val twoMillion = 2_000_000
    val arrayOfNumbers = IntArray(twoMillion)
    var sumOfPrimeNumbers = 0L
    arrayOfNumbers[0] = 1
    arrayOfNumbers[1] = 1
    var i = 2
    while (i * i < twoMillion) {
        if (arrayOfNumbers[i] == 0) {
            var j = i * i
            while (j < twoMillion) {
                arrayOfNumbers[j] = 1
                j += i
            }
        }
        i++
    }
    for (index in arrayOfNumbers.indices) {
        if (arrayOfNumbers[index] == 0) {
            sumOfPrimeNumbers += index
        }
    }
    println(sumOfPrimeNumbers)
}