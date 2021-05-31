/* WAP to check whether an entered year is Leap year or not */

fun main() {
    println("Enter Year")
    val year = readLine().toString().toInt()
    var checkCondition = false
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                checkCondition = true
            }
        } else {
            checkCondition = true
        }
    }

    if (!checkCondition) {
        println("It is NOT Leap Year")
    } else {
        println("It is Leap Year")
    }
}