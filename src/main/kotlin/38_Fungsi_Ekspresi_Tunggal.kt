import kotlin.math.max

fun main() {
    println("Max value from max function = ${max(4, 7)}")
    println("Max value from max newMax function = ${newMax(3, 5)}")
}

fun max(a: Int, b:Int): Int {
    val maxValue = if (a > b)a else b
    return maxValue
}

fun newMax(a: Int, b:Int) : Int = if (a > b) a else b