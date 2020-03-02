// WE have Break, Continue and Return
fun main() {

    // Break
    val arrayValue = arrayOf("Int", "String", "Float", "Double", "Array")
    for(value in arrayValue){
        println(value)
        if (value == "Float")
        break
    }

    // Continue
    for (z in 1..10){
        if ( z%2 != 0){
            continue
        }
        println(z)
    }

    // Return Type without Return Value
    for(i in 0..3){
        for (j in 0..3){
            println("$i - $j")
            if (i == 1 && j == 1)
                return
        }
    }

    // Return Type with Return Value
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
}



