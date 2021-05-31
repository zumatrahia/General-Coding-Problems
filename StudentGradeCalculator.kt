/* WAP to find the grade of a student. Take input marks of 3 subjects and calculate the percentage.
If percentage > 85 print A grade,
If percentage < 85 && percentage >= 75 print B grade,
If percentage < 75 && percentage >= 50 print C grade,
If percentage > 30 && percentage <= 50 print D grade,
If percentage <30 print fail */

fun main() {
    println("Enter 3 grades with space between")
    val gradeList = readLine().toString().split(" ").map { it.toFloat() }
    val averageOfGrades = (gradeList[0] + gradeList[1] + gradeList[2]) / 3
    println("Average is $averageOfGrades")
    if (averageOfGrades > 85.0)
        println("A Grade")
    if (averageOfGrades <= 85.0 && averageOfGrades > 75.0)
        println("B Grade")
    if (averageOfGrades <= 75.0 && averageOfGrades > 50.0)
        println("C Grade")
    if (averageOfGrades <= 50.0 && averageOfGrades > 30.0)
        println("D Grade")
    if (averageOfGrades <= 30.0)
        println("FAIL")
}