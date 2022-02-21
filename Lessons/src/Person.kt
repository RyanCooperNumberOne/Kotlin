class Person(public var name: String, private var age: Int, public val nation: String) {
    val ageCategories = if (age in 0..18) "First" else if (age in 19..45) "Second" else "Third"
    var isAdult: Boolean
        get() {
            return ageCategories != "First"
        }
        set(value) {
            println("Set value")
        }

}