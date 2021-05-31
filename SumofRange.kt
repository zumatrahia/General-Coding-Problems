/* WAP to find sum of all numbers within a given range */

fun main(){
    println("Entry range Start")
    val rangeStart = readLine().toString().toInt()
    println("Entry range End")
    val rangeEnd = readLine().toString().toInt()
    var result = 0

    for (i in rangeStart..rangeEnd){
        result += i
    }

    println("Sum is $result")
}