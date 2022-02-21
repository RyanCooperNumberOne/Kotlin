/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

fun main() {
    var number = 600851475143
    var lowerLimit = 2L
    while (lowerLimit != number) {
        if (number % lowerLimit == 0L) {
            number /= lowerLimit
        } else {
            lowerLimit++
        }
    }
    println(lowerLimit)
}