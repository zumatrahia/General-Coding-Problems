/* WAP to count number of digits in a number */

fun main(){
    println("Enter Number")
    val number = readLine().toString().toInt()
    when {
        number >= 1000000 -> println("7 digit and more number")
        number >= 100000 -> println("6 digit number")
        number >= 10000 -> println("5 digit number")
        number >= 1000 -> println("4 digit number")
        number >= 100 -> println("3 digit number")
        number >= 10 -> println("2 digit number")
        number >= 1 -> println("1 digit number")
    }
}