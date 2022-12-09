/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {

    var current = 1
    var max = 1

    a.sort()
    for (f in 0..a.size-2) {

        for (i in f..a.size-2)
            if (a[i + 1] - a[f] <= 1) {
                current++
            }

        if (current > max) max = current

        current = 1
    }

    return max
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(arrayOf(4, 6, 5, 3, 4, 3, 1))

    println(result)
}