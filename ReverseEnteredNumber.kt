/* WAP to reverse an entered number */

fun main(){
    println("Enter Number")
    val entry = readLine().toString().reversed().toInt()
    println(entry)
}