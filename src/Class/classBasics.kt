package Class

// if in case
// the Others() Class file inside another package we need to call
// import otherDetails.Others // like this


fun main() {
    subClass()

    var details = Details()
    details.personalDetails()

    var others = Others()
    others.dateOFBirth("26")

    strInterpolation()

}

fun subClass(){
    println("sample Sub function")
}


// String Interpolation - Video 6
fun strInterpolation() {

    var rect = rectangleArea()
    rect.breadth = 6
    rect.length = 8

    println(" the length of rect ${rect.length * rect.breadth}")

}

class rectangleArea {
    var length : Int = 0
    var breadth = 0
}

// REPL - Real Eval Print Loop - Video 7