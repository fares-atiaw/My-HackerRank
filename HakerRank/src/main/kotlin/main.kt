fun main() {
/*
//    halfTriangleOfNumbers()
//    halfTriangle(5, false)

//    var op : Any = 5
//    op = "dd gg"
//
//    if(op is String)
//        print("Yeaaaah")
//
//    val lista: List<String> = op.split(" ")
//    print(lista[1])

    val lista = mutableListOf("Mohamed Tamer", "Ali Ahmed", "Osama Mohamed")

    /*val words = ArrayList<String>()
    lista.map {
        words.addAll(it.split(" "))
    }

    println(words)*/

//    var words : List<String> = emptyList()
//
//    val lastWords = lista.map {
//        words = it.split(" ")
//        words[0][0] + words[1][0].toString()
//    }
//    println(lista)
//
//    println(lastWords)

//    var lol = lista.union(listOf(5,9))
//    var lol2 = lol.union(lastWords)
//
//    println(lol)
//    println(lol2)

    var myMap = mapOf(
        0 to true,
        "d" to 1,
        5 to false
    )
    myMap.entries
    println(myMap.entries)
*/

    var value1 : Int? = null
    println(value1 ?: 11); // <- 11
    var value2 : Int? = 50
    println(value2 ?: 11); // <- 50
}

fun talk() = print("Hello !")

fun halfTriangle(rows : Int = 5, inverted : Boolean = false)
{
    if(!inverted)
    {
        for(lines in 1..rows) {
            for(stars in 1..lines){
                print("* ")
            }
            println()
        }
    }
    else {
        for(lines in rows downTo 1) {
            for(stars in lines downTo 1){
                print("* ")
            }
            println()
        }
    }
}

fun halfTriangleOfNumbers(rows : Int = 5, inverted : Boolean = false)
{
    var nums : Int = 1

    if(!inverted)
    {
        for(lines in 1..rows) {
            for(i in 1..lines){
                print("$nums ")
                nums++
            }
            println()
        }
    }
    else {
        for(lines in rows downTo 1) {
            for(stars in lines downTo 1){
                print("* ")
            }
            println()
        }
    }
}