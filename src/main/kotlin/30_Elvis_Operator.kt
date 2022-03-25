fun main() {
    //Elvis Operator ?:
    var maybeWelcome: String? = "Hello World"
    println(maybeWelcome?.length ?: 0)
}