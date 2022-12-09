import java.util.*

/*
 * Complete the getMoneySpent function below.
 */

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var currentMax = -1

    for(i in keyboards.indices)
    {
        drives.forEach {
            if ((keyboards[i] + it) > currentMax && (keyboards[i] + it) <= b)
                currentMax = (keyboards[i] + it)
        }
    }

    return currentMax
}

fun main(args: Array<String>) {
    /*val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
*/
    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val b = 10
    val keyboards = arrayOf(3,1)
    val drives = arrayOf(5,2,8)

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
