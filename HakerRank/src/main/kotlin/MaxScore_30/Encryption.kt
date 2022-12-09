import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

/*
 * Complete the 'encryption' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun encryption(s: String): String {
    val line = s.replace(" ", "");
    val rows = floor(sqrt(line.length.toFloat())).toInt()
//    val columns = if(sqrt(line.length.toFloat()) > rows.toFloat()) rows+1 else rows
    val columns = ceil(sqrt(line.length.toFloat())).toInt()

    /** My Technique **/
    /*val array = Array(columns) { Array(columns) { ' ' } }

    var charsNum = 0
    for (r in 0 until columns)
    {
        for (c in 0 until columns){
            when(charsNum){
                (line.length) -> {}
                else -> {
                    array[r][c] = line[charsNum]
                    charsNum++
                }
            }
        }
    }

    charsNum = 0
    var encryptedString = ""

    for (c in 0 until columns)
    {
        for (r in 0 until columns){
            when(charsNum){
                line.length -> {}
                else -> {
                    when(array[r][c]){
                        ' ' -> {}
                        else -> {
                            encryptedString += array[r][c]
                            charsNum++
                        }
                    }
                }
            }
        }
        encryptedString += " "
    }

    return encryptedString*/

    /** Other Technique **/
    var encryptedString = ""
    var jump = 0

    for (c in 0..columns)
    {
        jump = 0
        while (c+jump < line.length-1){
            encryptedString += line[c+jump]
            jump += columns
        }
        encryptedString += " "
    }

    return encryptedString
}

fun main(args: Array<String>) {
//    val s = readLine()!!

    val result = encryption("feed the dog")

    println(result)
}
