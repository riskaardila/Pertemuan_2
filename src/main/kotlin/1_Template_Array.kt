fun main() {
    // Buatlah Array<String> dengan size 5 dan Nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}

