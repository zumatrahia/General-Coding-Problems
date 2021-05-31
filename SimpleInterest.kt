/* WAP to find Simple Interest */

fun main(){
    println("Enter Principal Balance")
    val principleBalance = readLine().toString().toFloat()
    println("Enter Annual Rate")
    val annualRate = readLine().toString().toFloat()
    println("Enter Time of Loan in Years")
    val timeOfLoan = readLine().toString().toFloat()
    var finalAmount = principleBalance*(1 + annualRate*timeOfLoan)
    println("Final Amount is " + finalAmount)

}