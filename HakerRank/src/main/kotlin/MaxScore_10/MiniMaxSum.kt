/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {

    var max = arr[0]
    var mini = arr[0]
    var sum = 0

    arr.forEach {
        if (it > max) max = it
        if (it < mini) mini = it

        sum += it
    }

    println("${sum - max} ${sum - mini}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
