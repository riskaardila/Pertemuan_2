import kotlin.math.PI

fun main() {
    //Advanced exercise
    print("Enter the circle's radius")
    val radius = readln()!!.toDouble()
    var circumference = 2 * PI * radius
    var area = PI * radius * radius
    println("The circle's circumference based on the given radius is: " + circumference + " cm")
    println("Area of the circle is: " + area + " cm^2")
}