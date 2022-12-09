/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    var positive =0
    var negative =0
    var zeros =0

    /*arr.forEach {
        if (it > 0) positive++
        else if (it < 0) negative++
        else zeros++
    }*/

    positive = arr.count { it>0 }
    negative = arr.count { it<0 }
    zeros = arr.count { it==0 }

    println(positive/(arr.size).toDouble())
    println(negative/(arr.size).toDouble())
    println(zeros/(arr.size).toDouble())
    /*println("%.6f".format(positive/(arr.size)))
    println("%.6f".format(negative/(arr.size)))
    println("%.6f".format(zeros/(arr.size)))*/

    println(System.currentTimeMillis())
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    plusMinus(arr)

    plusMinus(arrayOf(1,2,0,-5,-8,-7))
}
