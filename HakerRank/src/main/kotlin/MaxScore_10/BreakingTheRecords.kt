/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    val result = arrayOf(0, 0)
    var miniNum = scores[0]
    var maxNum = scores[0]

    scores.forEach {
        if (it > maxNum) {
            maxNum = it
            result[0]++
        }
        else if (it < miniNum) {
            miniNum = it
            result[1]++
        }
    }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
