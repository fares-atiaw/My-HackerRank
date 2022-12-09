/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {

    if (year !in 1700..2700)
        return "nope"

    // In 1918, the next day after 31st January was 14th February which means 14th February was the 32nd day in year 1918 (for Russia).
    if (year == 1918)   // That is the year in which Russia transitioned from the Julian calendar system to the Gregorian calendar system.
        return "12.09.$year"

    return if (year < 1918) {   // Julian calendar system
        if (year % 4 == 0)
            "26.09.$year"
        else
            "13.09.$year"
    }
    else {  // Gregorian calendar system
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            "12.09.$year"
        else
            "13.09.$year"
    }

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
