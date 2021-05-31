/* WAP to find factorial of a number */

fun main(){
    println("Enter Number")
    val number = readLine().toString().toLong()
    var result = 1L
    for (i in 1L..number){
        result *= i
    }
    println("$number! is $result")
}