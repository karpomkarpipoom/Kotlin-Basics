package OOPs

class Cars(Name : String = "Audi" ,var Model : String, var Price : Int){

     init {
         println("welcome to CARS World")
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

    val car = Cars(Model = "A3", Price = 2000000)
    car.CalcGST()
}