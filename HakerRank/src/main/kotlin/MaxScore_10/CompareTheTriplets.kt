/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val resultArray = arrayOf(0,0)

    for(i in a.indices){ // or (i in 0 until a.size)
        if (a[i] > b[i])
            resultArray[0] += 1
        else if (a[i] < b[i])
            resultArray[1] += 1
    }

    a.zip(b).count { it.first > it.second }

    /*var count = 0
    a.forEach {
        if (it > b[count])
            resultArray[0] += 1
        else if (it < b[count])
            resultArray[1] += 1
        count++
    }*/
    return resultArray
}


fun main(args: Array<String>) {

//    val text = """
//    |Tell me and I forget.
//    |Teach me and I remember.
//    |Involve me and I learn.
//    |(Benjamin Franklin)
//    """.replaceIndentByMargin(newIndent = "L ", marginPrefix = "|")
//
//    println(text)

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = compareTriplets(a, b)

    println(result.joinToString(" "))

}
