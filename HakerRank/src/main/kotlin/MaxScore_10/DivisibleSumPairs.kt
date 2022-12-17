/*
 * Complete the 'divisibleSumPairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER k
 *  3. INTEGER_ARRAY ar
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
var counter = 0

    for (i in 0 until n-1)
    {
        for (j in i+1 until n )
        {
            if ((ar[i]+ar[j]) % k == 0) counter++
        }
    }

    return counter
}

fun main(args: Array<String>) {
//    val first_multiple_input = readLine()!!.trimEnd().split(" ")
//
//    val n = first_multiple_input[0].toInt()
//
//    val k = first_multiple_input[1].toInt()
//
//    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = divisibleSumPairs(n, k, ar)
    val result = divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2))

    println(result)
}
