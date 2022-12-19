/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
// from this
    /*for (lines in 1..n)
    {
        for(spaces in n-lines downTo 1)
            print(" ")

        for(hashes in 1..lines)
            print("#")

        println()
    }*/

// to this
    /*for (lines in 1..n)
    {
        print(" ".repeat(n-lines))
        println("#".repeat(lines))
    }*/

// More abbreviation
    for (lines in 1..n)
        println(" ".repeat(n-lines) + "#".repeat(lines))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
