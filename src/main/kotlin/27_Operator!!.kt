fun main() {
    // percobaan Operator !!
    var maybeNumber: Int? = 15
    maybeNumber = null
    if (maybeNumber != null) {
        println(maybeNumber * 2)
    }
    // akan terjadi error di println ini. maka kita baiki kode dengan kode yang ada di atas

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    println(s2.length)
}