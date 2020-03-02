import com.sun.tools.javac.Main

fun main(){

    // if - else if - else Statement
    var x = 5
    if (x == 1){
        println("X is equal to one = 1")
    }else if (x == 2){
        println("X is equal to Two = 2")
    }
    else{
        println("X is Not equal to one = 1")
    }

    // When Statement
    var stringValue = "WELCOME"
    when(stringValue){
        "WELCOME" -> println("Yes True")
        "welcome" -> println("not case sensitive ")
        else -> println("Noting Happens")

    }
    // When Statement with Exprestion
    var y : String = when(x){
        0 -> {
            "x"
            "X is 0" // only final value will return
        }
        1 -> {
            "X is 1"
        }
        2 -> {
            "X is 2"
        }
        else -> {
            var z = "x is equal to the $x"
            z
        }
    }
    println(y)
}