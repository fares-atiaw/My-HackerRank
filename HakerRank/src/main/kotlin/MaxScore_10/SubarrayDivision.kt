/*
 * Complete the 'MaxScore_10.birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    /**Mine**/
    /*var sum = 0
    var steps = 0
    var howMany = 0

    for(i in 0..(s.size-m))
    {
        for(step in i until s.size) {
            if(steps < m){
                sum += s[step]
                steps++
                if(sum == d && steps==m) {
                    howMany++
                    sum = 0
                    steps = 0
                    break
                }
            }
            else{
                sum = 0
                steps = 0
                break
            }
        }
    }*/

    /**Mine2**/
    /*var sum = 0
    var steps = 0
    var howMany = 0

    for(i in 0..(s.size-m))
    {
        for(step in i until s.size) {
            if(steps < m){
                sum += s[step]
                steps++
            }
        }

        if(sum == d && steps==m) howMany++

        sum = 0
        steps = 0
    }*/

    /**Mine3 + Other**/
    var howMany = 0

    for(i in 0..(s.size-m))
    {
        var sum = 0
        for(step in i until i+m) {
            sum += s[step]
        }

        if(sum == d) howMany++
    }

    return howMany
}

fun main(args: Array<String>) {
 /*   val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = MaxScore_10.birthday(s, d, m)*/
    val result = birthday(arrayOf(1, 2, 1, 3, 2), 3, 2)     //2
//    val result = MaxScore_10.birthday(arrayOf(4), 4, 1)
//    val result = MaxScore_10.birthday(arrayOf(1, 1, 1, 1, 1, 1), 3, 2)
//    val result = MaxScore_10.birthday(arrayOf(5, 2, 2, 1, 5, 3, 2), 9, 3)
//    val result = MaxScore_10.birthday(arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1), 18, 7)      //3

    println(result)
}
