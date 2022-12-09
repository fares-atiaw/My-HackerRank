/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    var roundedGrade = 0
    var roundedNum = 0

    for (i in grades.indices) {

        roundedGrade = grades[i]
        while (roundedGrade % 5 != 0) roundedGrade += 1

        grades[i] = if (roundedGrade >= 40) {
            roundedNum = roundedGrade - grades[i]
            when (roundedNum) {
                1 -> grades[i] + 1
                2 -> grades[i] + 2
                else -> grades[i]
            }
        } else
            grades[i]
    }

    return grades
}

fun main(args: Array<String>) {
//    val gradesCount = readLine()!!.trim().toInt()
//
//    val grades = Array<Int>(gradesCount, { 0 })
//    for (i in 0 until gradesCount) {
//        val gradesItem = readLine()!!.trim().toInt()
//        grades[i] = gradesItem
//    }

    val gradess: Array<Int> = arrayOf(73,67,81,33)

    val result = gradingStudents(gradess)

    println(result.joinToString("\n"))
}
