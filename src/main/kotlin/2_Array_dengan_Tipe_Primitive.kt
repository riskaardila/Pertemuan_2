fun main() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')

    // Array of int of size with Values [0, 0, 0, 0, 0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')

    // e.g initialise the values ini the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val  shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')

    // e.g initialise the values in the array using a Lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4]
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}