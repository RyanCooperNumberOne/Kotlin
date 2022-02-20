/*
* A permutation is an ordered arrangement of objects.
* For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
* If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
* The lexicographic permutations of 0, 1 and 2 are:
* 012   021   102   120   201   210
* What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
* */
var counter = 0
const val oneMillion = 1_000_000

fun generatePermutation(amountOfDigits: Int, lengthOfNumber: Int, list: MutableList<Int>) {
    if (lengthOfNumber < 1) {
        counter++
        if (counter == oneMillion) {
            for (i in list) {
                print(i)
            }
        }
        return
    }
    if (counter < oneMillion) {
        for (i in 0..amountOfDigits) {
            if (i !in list) {
                list.add(i)
                generatePermutation(amountOfDigits, lengthOfNumber-1, list)
                list.remove(i)
            }
        }
    }
}

fun main() {
    val list = mutableListOf<Int>()
    generatePermutation(9, 10, list)
}