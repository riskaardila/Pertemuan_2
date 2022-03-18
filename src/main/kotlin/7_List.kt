fun main() {
    val numbers = listOf("one", "three", "four")
    println("Number of Elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

    // List elements (includinf nulis) can dublicate
    val riska = Person("Riska", 20)
    val people = listOf<Person>(Person("Riska", 20), riska, riska)
    val people2 = listOf<Person>(Person("Riska", 20), Person("Riska", 20), riska)
    println(people == people2)
    riska.age = 22
    println(people == people2)
}

class Person(var name: String, var age: Int){}