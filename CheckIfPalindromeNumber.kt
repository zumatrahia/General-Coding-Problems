/* WAP to check whether an entered number is palindrome or not */
/*A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward
 such as madam or racecar.*/

fun main(){
    println("Enter Number")
    val entry = readLine().toString()
    val reversedEntry = entry.reversed()
    if (entry == reversedEntry)
        println("Is Palindrome")
    else
        println("Not Palindrome")
}