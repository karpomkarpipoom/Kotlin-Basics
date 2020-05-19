package OOPs

open class CarOverRiding(){

    var Name : String = "Audi"
    var Model : String = "A3"
    var Price : Int = 2000000

    var Year : Int = 2018

    fun Print(){
        println("welcome to CARS World ${this.Name} ${this.Model} make on " + this.Year)
    }

    open fun CalcGST() : Int {
        val GSTPerc = 15
        val Amount = this.Price

        var GSTAmount = (Amount * GSTPerc) / 100

        println("----- $GSTAmount -----")
        var NetPrice = Amount + GSTAmount

        println(NetPrice)
        return  NetPrice
    }

}

class CalCOverRiding() : CarOverRiding() {

    var taxAmount : Int = this.CalcGST()

    fun AddRoadTax() : Int {
        var amount = taxAmount
        var Tax = 3500

        amount = amount.plus(Tax)
        return amount
    }

    override fun CalcGST() : Int {
        val GSTPerc = 30
        val Amount = this.Price

        var GSTAmount = (Amount * GSTPerc) / 100

        println("----- $GSTAmount -----")
        var NetPrice = Amount + GSTAmount

        println(NetPrice)
        return  NetPrice
    }
}

fun main() {

    val car = CarOverRiding()
    println("CARS = ${car.Name} ${car.Model} with GST Price " + car.CalcGST())

    val GST : Any = 11
    println( "   ${GST as? Int} ---- 0 ----")

    val carWithTax = CalCOverRiding()
    println("CARS = ${carWithTax.Name} ${carWithTax.Model} with GST + Road Tax Price " + carWithTax.AddRoadTax())

    println(carWithTax.CalcGST())
}