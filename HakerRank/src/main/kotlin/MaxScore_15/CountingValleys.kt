/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    var altitude = 0
    var numValleys = 0

    for(step in 1..steps){
        if(path.substring(step-1, step) == "U") {
            altitude++
        }
        else {
            if (altitude == 0) numValleys++
            altitude--
        }
    }

    /*for(step in 1..steps){
        if(path.substring(step-1, step) == "U") {
            if (altitude == -1) numValleys++
            altitude++
        }
        else
            altitude--
    }*/

    return numValleys
}

fun main(args: Array<String>) {
    val steps = 12

    val path = "DDUUDDUDUUUD"

    val result = countingValleys(steps, path)

    println(result)
}
