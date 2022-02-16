/*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* */

fun main() {
    val list = arrayListOf(1)
    var number = 1L
    for (i in 2..20) {
        var iNew = i
        for (j in list) {
            if (iNew % j == 0) {
                iNew /= j
            }
        }
        list.add(iNew)
        number *= iNew
    }
    println(number)
}