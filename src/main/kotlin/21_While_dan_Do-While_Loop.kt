fun main() {
    //while Loop
    var x:Int = 0
    println("Example of while Loop--")
    while (x <= 10){
        print("$x")
        x++
    }
    print('\n')

    //Do-While Loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do black--" +y)
    } while (y <= 50)
}