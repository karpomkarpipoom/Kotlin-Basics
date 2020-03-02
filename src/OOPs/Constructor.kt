package OOPs

import java.time.Year


class CarConstructor(){

    var Name : String = "Audi"
    var Model : String = ""
    var Price : Int = 0

    var Year : Int = 2000

    constructor(Name : String = "Audi" , Model : String,  Price : Int) : this() {
        this.Name = Name
        this.Model = Model
        this.Price = Price
    }

    constructor(year: Int) : this(){
        this.Year = year
    }

    fun Print(){
        println("welcome to CARS World ${this.Name} ${this.Model} make on " + this.Year)
    }

    fun CalcGST(){
        val GSTPerc = 15
        val Amount = this.Price

        var GSTAmount = (Amount * GSTPerc) / 100

        println("----- $GSTAmount -----")
        var NetPrice = Amount + GSTAmount

        println(NetPrice)
    }

}

fun main() {

    val car = CarConstructor(Name = "BMW", Model = "Z1", Price = 2200000)
    car.CalcGST()

    val carMake = CarConstructor(year = 2018)

    car.Print()
    carMake.Print()
}