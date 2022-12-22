package Chalenges
/*
 * Complete the 'Chalenges.lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyinteger(a: Array<Int>): Int {
    var count = 0

    for (x in a.indices)
    {
        for (y in a.indices)
        {
            if (a[x] == a[y]) count++
        }

        if(count == 1)
            return a[x]
        else
            count = 0
    }

    return 0
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = Chalenges.lonelyinteger(a)
    val result = lonelyinteger(arrayOf(1,1,5,2,2,3,4,3,4))

    println(result)
}
