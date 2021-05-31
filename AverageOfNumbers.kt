/* WAP to find average of 3 numbers */

fun main() {
    println("Please Enter Integer Numbers to Add with Space Between Each --->")
    val listOfEntries = readLine().toString().split(" ").map { it.toInt() }
    var result = 0
    var count = 0
    for (i in listOfEntries) {
        result += i
        count++
    }
    print("The average of integers is " + result / count)
}