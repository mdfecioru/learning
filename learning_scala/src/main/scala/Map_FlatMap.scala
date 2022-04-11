object Map_FlatMap extends App {
    val listNumbers = List(1, 2, 3, 4)
    val listStr = List("a", "b", "c")

    println(s"List of numbers: $listNumbers")
    println(s"List of strings: $listStr")

    val m = listNumbers.map(n => listStr.map(s => n + s))
    println(s"Map example: $m")

    val fm = listNumbers.flatMap(n => listStr.map(s => n + s))
    println(s"Flat Map example: $fm")
}
