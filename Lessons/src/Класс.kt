class Class1(var firstName: String = "BOB", var secondName: String = "MARLIE") {
    var login: String? = null
        set(value) {
            field = if (value == "Codi")
                "None"
            else
                value
            println("Значение переменной: $field")
        }
        get() {
            val loginField = field ?: "Неизвестно"
            println("Переменная равна: $loginField")
            return field
        }

    fun printClass() {
        println("$firstName $secondName")
    }
}

fun main() {
    val person1 = Person("Bob", 22, "russian")
    println(person1.ageCategories)
    person1.name = "Boris"
    println(person1.isAdult)
}