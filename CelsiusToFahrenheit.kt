/* WAP to convert temperature in degree Celsius to   Fahrenheit */

fun main() {
    println("Enter Your Degree in Celsius")
    var entryCelsius = readLine().toString().toFloat()
    println("In Fahrenheit it is " + celsiusToFahrenheit(entryCelsius) + " degrees.")

}

fun celsiusToFahrenheit(entry: Float): Float {
    var result = (entry * (9 / 5)) + 32
    return result
}