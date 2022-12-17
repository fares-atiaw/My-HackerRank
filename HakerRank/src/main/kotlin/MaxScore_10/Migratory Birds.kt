/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int { // the most repeated element and if there is more than one , get the first one
    /** Mine (successes in all except one test case)**/
    /*var maxNum = 0
    var maxElement = 0
    var n = 0
    val arrayList = arrayListOf<Int>()

     for (i in arr.indices)
     {
         if (!arrayList.contains(arr[i])) {
             arrayList.add(arr[i])

             n = arr.count { arr[i] == it }

             if (maxNum < n) {
                 maxNum = n
                 maxElement = arr[i]
             }
             n = 0
         }
     }

    return maxElement*/

    /** Other **/
    val listOfRepeats = Array(arr.size) { 0 }

    for (i in arr.indices)
    {
        listOfRepeats[arr[i]]++
    }

    return listOfRepeats.indexOf(listOfRepeats.max())
}

fun main(args: Array<String>) {
//    val arrCount = readLine()!!.trim().toInt()
//
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = migratoryBirds(arr)
    val result = migratoryBirds(arrayOf(1, 4, 4 ,4, 5, 3))    //4
//    val result = migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))   //3

    println(result)
}
