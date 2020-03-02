
fun main(){

    val stringValueOne = "karpom"
    val stringValueTwo = "Karpipoom"

    // Without Extension
    val TwoValues = stringValueOne + " " + stringValueTwo
    println(TwoValues)

    //with Extension
    val StringFinal = stringValueOne.addTwoValue(stringValueOne,stringValueTwo)
    println(StringFinal)

    val IntValue = 5
    println(IntValue.FindGreaterValue(6))
}

fun String.addTwoValue(StringOne : String, StringTwo : String) : String{
    return StringOne + " " + StringTwo
}

fun Int.FindGreaterValue(SecondValue : Int) : Int{

    if(this > SecondValue){
        return this
    }else{
        return SecondValue
    }
}