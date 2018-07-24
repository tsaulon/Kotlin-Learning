fun main(args: Array<String>){

    var items = listOf("apple", "banana", "kiwifruit", "orange")

    //  Iterating over a collection
    for(item in items)
        println(item)
    println()

    //  Checking if a collection contains an object using 'in' operator
    //  'when' finishes checking collection after first check is satisfied
    when{
        "orange" in items -> println("Maybe I'll have an orange...?")
        "apple" in items -> println("Definitely going to go with apples")
        "dragonfruit" in items -> println("What is this?")
    }

    //  Using lambda expressions to filter and map collections
    items
            .filter{it.startsWith("a")}   //  check for elements starting with 'a'
            .sortedBy { it }                    //  sort by natural order (Sort type inferred by datatype)
            .map{   it.toUpperCase()}           //  for each string set to uppercase
            .forEach{println(it)}               //  print each line


    //  Checking behavior of .sortedBy{} lambda expression
    //  Sorts list on natural sort order (Sort type inferred by datatype)
    println()
    println("Initial: $items")
    items = items.plus("abacus")    //  add new element
    println("Adding element: $items")  //[apple, banana, kiwifruit, orange, abacus]
    println("After Sorting: ${items.sortedBy{ it }}}")  //  print sorted array

}