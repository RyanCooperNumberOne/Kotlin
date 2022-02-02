fun main(args: Array<String>) {
    val table: Array<Array<Int>> = Array(5) {Array(5) {0}}
    for(row in table){
        for(cell in row){
            print("$cell  ")
        }
        print("\n")
    }
}
