/**
* A palindromic number reads the same both ways.
* The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
* */

fun isPalindromeNumber(number: Int): Boolean {
    val string = number.toString()
    var i = 0
    while (i < string.length / 2) {
        if (string[i] != string[string.length - 1 - i]) {
            return false
        }
        i++
    }
    return true
}

fun main() {
    var largestPalindrome = 0
    for (i in 999 downTo 100) {
        for (j in 999 downTo 100) {
            if (isPalindromeNumber(i * j)) {
                if (largestPalindrome < (i * j)) {
                    largestPalindrome = i * j
                    println(i * j)
                }
                break
            }
        }
    }
}