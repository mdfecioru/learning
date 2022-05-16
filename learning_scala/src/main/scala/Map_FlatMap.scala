object Map_FlatMap extends App {

    def combiningLists() = {
        val listNumbers = List(1, 2, 3, 4)
        val listStr = List("a", "b", "c")

        println(s"List of numbers: $listNumbers")
        println(s"List of strings: $listStr")

        // Map = One Input -> One Output
        // First map call will map each number from listNumbers to the
        // result of "listStr.map(s => n + s)" which will be a list
        val m = listNumbers.map(n => listStr.map(s => n + s))
        println(s"Map example: $m")

        // FlatMap = One Input -> Many Output
        // The flatMap call will map each number from listNumbers to
        // the elements of the "listStr.map(s => n + s)".
        //   -> So the resulted list from "listStr.map(s => n + s)" will be
        //      decomposed and the elements of the list will be associated
        //      with each number from listNumbers instead of the list itself
        val fm = listNumbers.flatMap(n => listStr.map(s => n + s))
        println(s"Flat Map example: $fm")

        println(s"\n --------------------------------- \n")

        val listNames = List("Alice", "Bob")
        println(s"List of names: $listNames")
        val m2 = listNames.map(_+"|")
        println(s"Map lowercase: $m2")
        val fm2 = listNames.flatMap(_+"|")
        println(s"FlatMap lowercase: $fm2")
    }

    def optionalExample() = {

    }

    combiningLists()

}
