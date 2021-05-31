/* WAP to count number of digits in a number */

fun main() {
    println("Enter Number")
    val number = readLine().toString().split("")
    println("Digit Number is " + (number.size - 2))

}