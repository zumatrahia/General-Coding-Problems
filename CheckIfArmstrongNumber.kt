/* WAP to check whether an entered number is an armstrong number or not.
* Armstrong number is a number that is equal to the sum of cubes of its digits.*/

fun main() {
    println("Enter Number")
    val number = readLine().toString()
    val digitList = number.map { "$it".toInt() }
    val entryNumber = number.toInt()
    if (entryNumber == eachMemberCubedAndAdded(digitList))
        println("Is Armstrong")
    else
        println("No Armstrong")
}

fun eachMemberCubedAndAdded(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i * i * i
    }
    return result
}