fun main(args: Array<String>) {
    var word: String? = null
    var isHasCar = true

    //if(word == null)
    //    print("Переменная word равна значению null")
    // если внутри иф идна строчка, фигурные скобки можно не писать {}

    if(word == null){
        isHasCar = false
        if(!isHasCar || word == null){ // || - or, && - and
            println("Что-то сработало")
        }
        println("Чsergsg")
        println("esgeg")
    } else  if(word == "Hello") {
        println("Переменная word равна $word")
        println("else if")
    } else {
        println("else")
        println("word $word")
    }

    val number = 5
    when(number){
        null -> println("Переменная number равна null")
        10 -> println("Переменная равна 10")
        5 -> println("Переменная равна 5")
        else -> println("Переменная какая-то непонятная")
    }

//    var res = 0
//    if(number > 30)
//        res = 1
//    else
//        res = 0
// ниже представлена сокращенная запись

    var res = if(number > 30) 1 else 0


    var words = when(number){
        null -> "Ничего"
        else -> number
    }


}