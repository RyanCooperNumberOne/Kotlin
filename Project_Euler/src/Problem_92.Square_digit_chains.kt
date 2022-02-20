/*
* A number chain is created by continuously adding the square of the digits
* in a number to form a new number until it has been seen before.
* For example,
* 44 → 32 → 13 → 10 → 1 → 1
* 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
* Therefore any chain that arrives at 1 or 89 will become stuck
* in an endless loop. What is most amazing is that EVERY starting
* number will eventually arrive at 1 or 89.
* How many starting numbers below ten million will arrive at 89?
* */

fun addingSquareOfDigits(number: Int): Int {
    val stringNumber = number.toString()
    var sumOfSquares = 0
    for (i in stringNumber) {
        sumOfSquares += (i.code - 48) * (i.code - 48)
    }
    return sumOfSquares
}

fun numberChainAddingSquareOfDigits(number: Int): Int {
    var newNumber = number
    while (addingSquareOfDigits(newNumber) != 89 && addingSquareOfDigits(newNumber) != 1) {
        newNumber = addingSquareOfDigits(newNumber)
    }
    return addingSquareOfDigits(newNumber)
}

fun main() {
    val tenMillion = 10_000_000
    var counter = 0
    for (i in 1..tenMillion) {
        if (numberChainAddingSquareOfDigits(i) == 89) {
            counter++
        }
    }
    print(counter)
}