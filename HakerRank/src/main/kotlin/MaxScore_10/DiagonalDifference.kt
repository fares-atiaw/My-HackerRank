import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var leftToRightDiagonal = 0
    var rightToLeftDiagonal = 0
    val coordinates = arr[1].size-1

    for(i in 0..coordinates)
    {
        leftToRightDiagonal += arr[i][i]
        rightToLeftDiagonal += arr[i][coordinates - i]
        print("")
    }

//    var result = leftToRightDiagonal - rightToLeftDiagonal
//    if(result<0) result *= -1

    val result = abs(leftToRightDiagonal - rightToLeftDiagonal)

    return result
}

fun main(args: Array<String>) {
    /*val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }*/

    val a = arrayOf(1,2,8)
    val b = arrayOf(4,5,6)
    val c = arrayOf(7,8,9)

    val arr : Array<Array<Int>> = arrayOf(a,b,c)

    val result = diagonalDifference(arr)

    println(result)

//    getArraysDimensions()
}


fun getArraysDimensions() {

    var a = arrayOf(1,2,3, 123)
    var b = arrayOf(4,5,6, 456)
    var c = arrayOf(7,8,9, 789)
    var d = arrayOf(10,11,12, 1000)

    var m : Array<Array<Int>> = arrayOf(a,b,c,d)

    println(m[0])   //a class
    println(m[0][3]) //123

}