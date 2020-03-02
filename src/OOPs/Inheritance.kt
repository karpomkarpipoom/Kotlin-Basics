package OOPs


open class CarInheritance(){

    var Name : String = "Audi"
    var Model : String = "A3"
    var Price : Int = 2000000

    var Year : Int = 2018

    fun Print(){
        println("welcome to CARS World ${this.Name} ${this.Model} make on " + this.Year)
    }

    fun CalcGST() : Int {
        val GSTPerc = 15
        val Amount = this.Price

        var GSTAmount = (Amount * GSTPerc) / 100

        println("----- $GSTAmount -----")
        var NetPrice = Amount + GSTAmount

        println(NetPrice)
        return  NetPrice
    }

}

class Calculations() : CarInheritance() {

    var taxAmount : Int = this.CalcGST()

    fun AddRoadTax() : Int {
        var amount = taxAmount
        var Tax = 3500

        amount = amount.plus(Tax)
        return amount
    }
}

fun main() {

    val car = CarInheritance()
    println("CARS = ${car.Name} ${car.Model} with GST Price " + car.CalcGST())

    val carWithTax = Calculations()
    println("CARS = ${carWithTax.Name} ${carWithTax.Model} with GST + Road Tax Price " + carWithTax.AddRoadTax())

}