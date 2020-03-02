
// loop Statement
fun main(){

    loopStatements()
    specialCase()

    // Return Statement
    var value = maxOf(5,6)
    println(value)
}

fun loopStatements(){
    println("------------------------------------------------------------")
    println("Loop Condition Statement\n")

    // For loop
    for (i in 0..5 ){ println(i) }

    // with Array
    val arrayValue = arrayOf("India","USA","China","Australia","Sri Lanka")

    for (i in arrayValue) { println(i) }

    for (i in arrayValue){
        if (i == "India"){
            println("Welcome to Incredible India")
        }
    }

    // While Loop
    // mostly we are not using
    var x = 0
    while (x < 9){
        println(x)
        x++
    }


    // Do While Loop
    // work first and check Condition later
    var y = 0
    do {
        println("$y value")
        y++
    }while (y < 0)
}

fun specialCase(){

    val name = arrayOf("value","value 1","value 2","value 3")

    Cond@ for (i in name){

        for (appendFileName in 0..3){
            println("$i-$appendFileName")
            if (i == "value 3")
                break@Cond // no space or comma
        }
    }
}
