fun main() {
    // Ranges
    val i:Int = 2
    for (j in 1..4)
        print(j)
    println()

    if (i in 1..10) {
        println("We Found your number --" + i)
    }
}