package OOPs

interface message {

    val helloWorld
        get() = "welcome world"

    fun WelcomeMessage(){
        println("Welcome to the Interface world")
    }

}

interface calc {

    fun CalcGST(Price : Int) : Int {
        val GSTPerc = 15

        var GSTAmount = (Price * GSTPerc) / 100

        var NetPrice = Price + GSTAmount

        println(NetPrice)
        return  NetPrice
    }

    fun AddRoadTax(taxAmount : Int) : Int {
        var Tax = 3500

        var amount = taxAmount.plus(Tax)
        return amount
    }
}

class BMW : message, calc {

    internal var value = "facebook"
    override fun WelcomeMessage(){
        println("Welcome to the BMW world")
    }

}

class Ford : message, calc {

    override fun WelcomeMessage(){
        println("Welcome to the Ford world")
    }
}

fun main() {

    val bmw = BMW()

    bmw.WelcomeMessage()
    println(bmw.helloWorld)
    bmw.WelcomeMessage()

    val gst = bmw.CalcGST(2200000)
    println(gst)

    val ford = Ford()
    val fordGst = ford.CalcGST(1000000)
    val totalAmount = ford.AddRoadTax(fordGst)

    println("----- ford -----")
    ford.WelcomeMessage()
    println(totalAmount)

}