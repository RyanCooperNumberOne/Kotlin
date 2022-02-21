fun main(args: Array<String>) {
    println("Введите два числа x, y:")
    val (x, y) = readln().split(" ").map(String::toInt)

    if (x > y) {
        println("x > y, $x > $y")
    } else if (x < y) {
        println("x < y, $x < $y")
    } else {
        println("x = y, $x = $y")
    }

    val xIsGreaterThanY = if (x > y) {
        println("x > y, $x > $y")
        1
    } else {
        println("x <= y, $x <= $y")
        0
    }


    val word: String? = null
    var isHasCar: Boolean
    if (word == null) {
        isHasCar = false
        if (!isHasCar || word == null) { // || - or, && - and
            println("Что-то сработало")
        }
        println("Чsergsg")
        println("esgeg")
    } else if (word == "Hello") {
        println("Переменная word равна $word")
        println("else if")
    } else {
        println("else")
        println("word $word")
    }

    val number = if (x > y) readln().toInt() else null
    when (number) {
        null -> println("Переменная number равна null")
        10 -> println("Переменная равна 10")
        5 -> println("Переменная равна 5")
        in 1..8 -> println("В диапазоне от 1 до 8")
        in 9..100 -> println("In range 9 to 100")
        else -> println("Переменная какая-то непонятная")
    }

    var res = if (number != null && number > 30) 1 else 0


    var words = when (number) {
        null -> "Ничего"
        else -> number
    }


}