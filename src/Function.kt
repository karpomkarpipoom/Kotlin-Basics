
fun main(){

    println(FullName("bala", "Murugan"))

    InternationalStand("bala","Murugan")

    val userAge = age(26)
    println("User is $userAge")
}

// fun : KeyWord
// FullName : Method Name
// (firstName : String, LastName : String) : Parameters
// ": String" : ReturnType
fun FullName(firstName : String, LastName : String) : String {
    return "Full Name : " + firstName + " " + LastName
}

// ": Unit" : Not Return Type, its Void. u can use r no need to mention
fun InternationalStand(firstName : String, LastName : String) : Unit {
    println("Full Name : " + LastName + " " + firstName)
}

// Function as Expressions
fun age(age : Int) : String = if (age > 17) "adult" else "Kid"