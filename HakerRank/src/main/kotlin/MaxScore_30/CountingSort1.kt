/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    val array = Array(arr.max()+1) { 0 }

    arr.forEach {
        array[it]++
    }
    return array
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = countingSort(arr)
    val result = countingSort(arrayOf(1,1,2,5,9,5,8,6,7,2,1,8,3,4,2,3))

    println(result.joinToString(" "))
}