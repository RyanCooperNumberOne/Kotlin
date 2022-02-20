fun sayHello() {
    println("Hello")
}

fun func1(fir_1: String, sec_2: Int) {
    println("Hello!!! $fir_1$sec_2")
}

// функции, которые ничего не возвращают, возвращают Unit
fun add2(x: Int, y: Int): Int {
    return x + y
}

//fun say_s(first: Boolean): String{
//    return "Hello, world! $first"
//}
// можно в одну строку написать

fun sayS(first: Boolean) = "Hello, world! $first"

fun returnStringOrNull(str: String="Hello", bool: Boolean=true): String? {
    if (bool) {
        return str
    }
    return null
}

fun main(args: Array<String>) {
    func1("Hi,", 34)
    val result = add2(568, 523)
    println(result)
    println(sayS(true))
    sayHello()

    var variableStringOrNull: String? = returnStringOrNull("Hello")
    println(variableStringOrNull!!.length)
    variableStringOrNull = returnStringOrNull(bool = false)
    println(variableStringOrNull!!.length)
}