fun printAA(items: List<Any>){
    items.forEach { el ->
        println(el)
    }
}


fun main(args: Array<String>){
    var items: Array<Int> = arrayOf(5, 7, 23, 2, 7)
    println(items[0]) // значение первого элемента
    println(items.get(1)) // значение второго элемента
    println(items.size) // размер массива
    items.set(0, 34) // добавить первый элемент, равный 34
    println(items[0])

//    for(el in items){
//        println(el)
//    }

//    val someArray = arrayOf(1)

    items.forEach{ // специальная функция для перебора массива
            el -> println(el)
    }

    items.forEachIndexed{ iex, i -> //первое - индекс, второе - само значение
        println("$i с индексом $iex")
    }

    var tdf = listOf(5, 265, 24, 35, 7) // у списка больше функций
    //, чем у массива
    //var user: Map<String, Any> = mapOf("name" to "bob", "age" to 1, "isHasCar" to true)
    var user = mapOf("name" to "bob", "age" to 1, "isHasCar" to true)
    //mapOf - ассоциативный массив
    user.forEach{key, value -> println("$key -> $value")
    }

    // mutable - изменяемые массивы (списки)
    var items_list = mutableListOf<Any>(1, 34, 35, 78, 13)
    // в дальнейшем мы будем добавлять другие типы данных,
    // поэтому оставим явное указание
    items_list.add("Doge")

    //Any - тип данных
    var usfg = mutableMapOf<Any, Any>("name" to "mane")
    usfg.put("city", "New York")
    usfg["country"] = "China"
    usfg.put(2, 28)
    println(usfg)

    printAA(items_list)
}