
//    val VariableName = KeyWord<key , Value>

fun main(arg : Array<String>){

    var MapValues = HashMap<Double , String>()

    MapValues.put(1.0, "Enthiran")
    MapValues.put(2.0, "Enthiran 2.0")
    MapValues.put(3.0, "Enthiran Unknown")

    // println("Rajini sir Movies " + MapValues[2.0])

    MapValues.put(3.0, "Enthiran Unbelievable")

    // println("Rajini sir Movies " + MapValues[3.0])

for (movie in MapValues.keys){
    println("Rajini sir Movies List by key " + MapValues[movie])
}

    for (Movies in MapValues.values){
        println("Rajini sir Movies List by values " + Movies)
    }

}