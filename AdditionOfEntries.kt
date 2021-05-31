/* WAP to take 2 numbers as input and print addition of those 2 numbers */

fun main() {
    println("Please Enter Integer Numbers to Add with Space Between Each --->")
    val listOfEntries = readLine().toString().split(" ").map { it.toInt() }
    var result: Int = 0
    for (i in listOfEntries) {
        result += i
    }
    print("The addition of integers is " + result)
}