fun main(){

    val arrayValue = arrayOf(1,2,3,4,5)

    val arrayOfValues = arrayOf<Int>(6,7,8,9,10)

    val arrayBuildOpt = intArrayOf(11,12,13,14,15)

    println(arrayValue.get(0))

    arrayValue.set(1, 0)

    arrayOfValues[4] = 11

    println(arrayOfValues[4])

    val empty = emptyArray<String>()

    println(arrayOfValues.max())
}