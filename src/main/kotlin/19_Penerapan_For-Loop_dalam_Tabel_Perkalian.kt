fun main() {
    println("simple multiplication table useing loops: ")
    for (i in 1..10) {
        print("$i")
    }
    println()
    for (i in 1..10){
        print("${i * 2}")
    }
    println()
    for (i in 1..10){
        print("${i * 3}")
    }
    println()
    for (i in 1..10){
        print("${1 * 4}")
    }
    println()
    for (i in 1..10){
        print("${1 * 5}")
    }
    println()
    for (i in 1..10) {
        print("${i * 6} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 7} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 8} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 9} ")
    }
    println()
    for (i in 1..10) {
        print("${i * 10} ")
    }
    println("\n\nHere's a simple multiplication table using nested loops:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}