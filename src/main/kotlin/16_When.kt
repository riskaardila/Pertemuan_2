fun main() {
    // use of when
    var x:Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    x = 2
    when (x) {
        1,2 -> println("value of x neither 1,2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}