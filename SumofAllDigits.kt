/* WAP to find sum of all digits of a number */

fun main() {
    println("Enter Number")
    var numberList= readLine().toString().map { "$it".toInt() }
    var result = 0
    for (i in numberList){
        result += i
    }
    println("Sum of all digits is $result")

}