/*
* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
* a^2 + b^2 = c^2
* For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.
* */

fun main() {
    val oneThousand = 1000
    loop@ for (i in 1..oneThousand-2) {
        for (j in 1..oneThousand-1-i) {
            val k = oneThousand - (i + j)
            if (i * i + j * j == k * k) {
                print("${i * j * k}")
                break@loop
            }
        }
    }
}