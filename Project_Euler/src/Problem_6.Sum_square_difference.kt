/*
* The sum of the squares of the first ten natural numbers is, 1^2+2^2+...+10^2=385
* The square of the sum of the first ten natural numbers is, (1+2+...+10)^2=55^2=3025
* Hence the difference between the sum of the squares of the first ten natural
* numbers and the square of the sum is 3025−385=2640.
* Find the difference between the sum of the squares of the first one
* hundred natural numbers and the square of the sum.
* */

fun main() {
    var sumOfSquares = 0
    var squareOfSum = 0
    val upperLimit = 100
    for (i in 1..upperLimit) {
        sumOfSquares += i * i
        squareOfSum += i
    }
    squareOfSum *= squareOfSum
    println(squareOfSum - sumOfSquares)
}