// Глобальные переменные
// Переменные обозначаются при помощи ключевого слова var
// Константы обозначаются при помощи ключевого
// Типы данных
/*
* Boolean -> true/false
* Byte -> [-2*7; 2*7)
* Short -> [-2*15; 2*15)
* Int -> [-2*31; 2*31)
* Long -> [-2*63; 2*63)
* Float ->
* Double ->
* Char -> 'a'
* String -> "hello"
* Any -> anything
* */

var booleanVariable1 = true
var byteVariable1: Byte = 127
var shortVariable1: Short = 2345
var intVariable1 = 93490
var longVariable1 = 34523L
var floatVariable1 = 23543.0F
var doubleVariable1 = 85435.354
var charVariable1 = 'a'
var stringVariable1 = "hello"
var anyVariable1: Any = 214

fun main(args: Array<String>) { // Основная функция, в которой записывается весь код
    /*
    * Арифметические операции
    * +, -, *, ++, --, %, /, shr, ushr, shl, and, or, xor, inv
    * */

    var number1 = 341 shr 2 //сдвигает в двоичной системе на 2 знака вправо
    var number2 = 91 shl 2 //сдвигает в двоичной системе на 2 знака вправо
    println("$number1 $number2")
    number1 = -63532 ushr 1 //сдвигает в двоичной системе на 1 знак вправо, меняет самый левый символ на ноль
    number2 = -63532 shr 1 //сдвигает в двоичной системе на 1 знак вправо, меняет самый левый на единицу
    /*
                        Int          Binary
                        -63532       11111111111111110000000000000100
    -63532 ushr 1       2147450882   01111111111111111000000000000010
    -63532 shr 1        -32766       11111111111111111000000000000010
    */
    println("$number1 $number2")
    number1 = 123
    number2 = 223
    println("${number1 and number2} ${number1 or number2} ${number1 xor number2} ${number1.inv()}")

    /*
    * Операции отношения
    * >, <, <=, >=, ==, !=, !, not(), in, !in
    */


}