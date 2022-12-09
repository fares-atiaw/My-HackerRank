/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    val listOfPerfectNums = mutableListOf<Int>()
    var flag = true
    var x = 0

    for(n in a[0]..b.first() step a[0])
    {
        a.forEach {
            if (!(n%it==0 && flag)) {
                flag = false
                return@forEach
            }
        }

        if (flag)
            b.forEach {
                if (!(it%n==0 && flag)) {
                    flag = false
                    return@forEach
                }
            }

        if (flag) listOfPerfectNums.add(n)

        flag = true
        println(++x)
    }

    return listOfPerfectNums.count()
}

fun main(args: Array<String>) {
//    val first_multiple_input = readLine()!!.trimEnd().split(" ")
//
//    val n = first_multiple_input[0].toInt()
//
//    val m = first_multiple_input[1].toInt()
//
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

//    val total = getTotalX(arr, brr)
    val total = getTotalX(arrayOf(2 ,4), arrayOf(16, 32, 96))

    println(total)
}
