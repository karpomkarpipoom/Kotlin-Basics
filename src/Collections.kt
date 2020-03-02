
// previouse
fun main(arg : Array<String>){

    var readOnlyMapOf = mapOf(1 to "First Name:", 2 to "Last Name :", 3 to "age")
    println(readOnlyMapOf)

    var MapOfValue = hashMapOf(1 to "bala", 2 to "murugan")
    MapOfValue.put(3, "26")

    println(MapOfValue)

    var readOnlyListOf = listOf("10th", "12th", "B.tech", "Job", "Youtube")
    readOnlyListOf.get(2)

    var ListOfValue = mutableListOf("10th", "12th", "B.tech", "Job","Android Dev", "Youtube")
    ListOfValue.add(5,"ios Dev")

    for (list in ListOfValue){
        println(list)
    }

    var readOnlySetOf = setOf(1,2,3,4,5,6,7,7,7,6,8)
    println(readOnlySetOf)


    var setOfValue = mutableSetOf(1,2,3,4,5,6,7,7,8)
    setOfValue.add(1)
    println(setOfValue)



}