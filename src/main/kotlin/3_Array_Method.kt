fun main(args: Array<String>) {
    // Arrary Method
    // Sort()
    val simpsonsA = arrayOf("Widiasih", "Ardila", "Riska", "RPL", "Rambe")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')

    // Sort()
    val simpsonsB: Array<String> = arrayOf("Widiasih", "Ardila", "Riska", "RPL", "Rambe")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpons in simpsons_sorted) {
        print(simpons + ' ')
    }
    print('\n')

    // Reverse() dan ReversedArray()
    val simponsC: Array<String> = arrayOf("Widiasih", "Ardila", "Riska", "RPL", "Rambe")
    simponsC.sort()
    simponsC.reverse()
    for (simpons in simponsC) {
        print(simpons + ' ')
    }
    print('\n')

    // IndexOf()
    val simponsD = arrayOf("Widiasih", "Ardila", "Riska", "RPL", "Rambe")
    val simpons = "RPL"
    val position = simponsD.indexOf(simpons)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} simpson!")
    } else {
        println("WOI ini bukan Simpson!")
    }

    val simponsE = arrayOf("Widiasih", "Ardila", "Riska", "RPL", "Rambe")
    println("Simpsons Size : " + simponsE.size)
    if (!simponsE.isEmpty())
        println("Array Tidak kosong!")
    println("Min = "+ simponsE.minOrNull())
    println("Max = "+ simponsE.maxOrNull())
    println("First = " + simponsE.first())
    println("Last = " + simponsE.last())
    println(simponsE.contains("Riska"))
}