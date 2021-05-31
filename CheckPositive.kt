/* WAP to check whether an entered number is positive or negative */

fun main() {
    println("Enter Number")
    var entryNumber = readLine().toString().toFloat()
    if (entryNumber > 0.0) {
        println("Positive")
    } else if (entryNumber < 0.0) {
        println("Negative")
    } else {
        println("It is 0")
    }
}