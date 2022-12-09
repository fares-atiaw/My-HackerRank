/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val pm = s.substring(8,9) == "P"
    var hours = s.substring(0,2).toInt()

    if(pm && hours != 12)
        hours += 12

    if(!pm && hours == 12)
        hours = 0

    return if (hours < 10)
        "0$hours${s.substring(2,8)}"
    else
        "$hours${s.substring(2,8)}"
}

fun main(args: Array<String>) {
//    val s = readLine()!!
//
    val result = timeConversion("12:40:22AM")

    println(result)
}

/*
1 AM to 12 PM -> true
1 PM to 11 PM -> +12
12 AM -> 00
 */