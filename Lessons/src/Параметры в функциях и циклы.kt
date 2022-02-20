fun printWord(word: String){
    println(word)
}
fun printSome(vararg some: String){
    some.forEach {el -> println(el)}
}
fun printHi(item: String, vararg hi: Any){
    println("$item: ")
    hi.forEach {a -> print("$a ")}
}
fun printLol(lol: String = "LOL", vararg total: Any){
    println("$lol: ")
    total.forEach {b -> print("$b ")}
}
fun main(args: Array<String>){
    var names = arrayOf("Bob", "John", "Alex")
    printWord("Some")
    printSome("Some", "Hello", "Vor")
    printHi("Kotlin", 2, 4, 'c', "str")
    printSome("lol", *names)
    printHi(item = "tem")
    printLol("Por", "u")

    // циклы
    println("")
    var i = 5
    ///////////////
    while(i >= 0){
        print("$i ")
        i--
    }
    //////////////
    do{// сначала делает, потом проверяет
        println("i = $i")
        i++
    }while (i <= 5)
    ////////////////
    for(j in 0..10 step 2){ //цикл от 0 до 10 с шагом 10
        print("$j ")
    }
    println("")
    ///////////////
    for(k in 10 downTo 0 step 2){
        print("$k ")
    }
    println("")
    ///////////////
    for(el in 'a'..'z' step 3){
        print("$el ")
    }
    println("")
    ///////////
    for(ele in 'z' downTo 'b' step 2) {
        print("$ele ")
    }
    println("")
    //////////////
    val x = 20
    if(x in 1..30){   //if(x !in 1..30 step){ если не в диапазоне
        println("$x ")
    }
}