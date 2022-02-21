fun main(args: Array<String>) {
    /**
     * Массивы представляют набора данных одного типа. В языке Kotlin
     * массивы представлены типом Array. При определении массива после
     * типа Array в угловых скобках необходимо указать, объекты какого
     * типа могут храниться в массиве. Например, определим массив целых чисел:
     */
    val numbersArray: Array<Int>

    /**
     * С помощью встроенной функции arrayOf() можно передать набор значений,
     * которые будут составлять массив. То есть в данном случае в массиве 5 чисел от 1 до 5.
     */
    val numbersArray2 = arrayOf(1, 2, 3, 4, 5) // [1, 2, 3, 4, 5]

    /**
     * Также инициализировать массив значениями можно следующим способом:
     */
    val numbersArray3 = Array(3) { 5 } // [5, 5, 5]

    /**
     * Но выражение, которое создает элементы массива, может быть и более сложным. Например:
     */
    var i = 1
    val numbersArray4 = Array(3) { i++ * 2 } // [2, 4, 6]

    /**
     * Для упрощения создания массива в Kotlin определены дополнительные типы
     * BooleanArray, ByteArray, ShortArray, IntArray, LongArray, CharArray,
     * FloatArray и DoubleArray, которые позволяют создавать массивы для
     * определенных типов. Например, тип IntArray позволяет определить массив
     * объектов Int, а DoubleArray - массив объектов Double:
     */
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)

    /**
     * Массив может в себе хранить тип данных Any.
     * Для перебора массива можно использовать цикл for.
     */
    val anyArray = arrayOf(1, 2, 3.0, "4")
    anyArray[0] = 1L
    for (item in anyArray) {
        println(item)
    }

    /**
     * Двумерные массивы
     */
    /**
     * Определение двухмерных массивов менее интуитивно
     * понятно и может вызывать сложности. Например, двухмерный массив чисел:
     */
    val table: Array<Array<Int>> = Array(3) { Array(5) { 0 } }

    var x = 1
    var y = 1
    val productTable = Array(9) {
        Array(9) {
            y = if (x == 10) {
                x /= 10
                y + 1
            } else y
            x++ * y
        }
    }

    for (row in productTable) {
        for (cell in row)
            print("$cell\t")
        println()
    }
}