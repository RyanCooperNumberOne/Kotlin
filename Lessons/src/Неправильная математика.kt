fun abs(int: Int): Int {
    return if (int < 0) -int else int
}

fun modOfInt(firstNumber: Int, secondNumber: Int): Int {
    var divisible = firstNumber
    if (secondNumber == 0)
        throw Exception("/ by zero")
    if (firstNumber == 0 || firstNumber == secondNumber)
        return 0
    when {
        (firstNumber > 0 && secondNumber > 0 || firstNumber < 0 && secondNumber < 0 ) -> {
            while (abs(divisible) > abs(secondNumber))
                divisible -= secondNumber
            return divisible
        }
        (firstNumber < 0 && secondNumber > 0 || firstNumber > 0 && secondNumber < 0 ) -> {
            while (abs(divisible) > abs(secondNumber))
                divisible += secondNumber
            return divisible + secondNumber
        }
    }
    return firstNumber
}

fun main() {
    println(modOfInt(20, -7)) //-1
    println(modOfInt(20, 7)) //6
    println(modOfInt(-20, 7)) //1
    println(modOfInt(-20, -7)) //-6
    println(modOfInt(20, 20)) //0
    println(modOfInt(-20, -20)) //0

    var number: Byte = 120
    while (number > 0) {
        number++
        println(number)
    }

    println(0.1 + 0.1  + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1)
}