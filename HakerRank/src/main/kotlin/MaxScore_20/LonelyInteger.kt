/*
 * Complete the 'Chalenges.lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyInteger(a: Array<Int>): Int {
    /** Mine **/
    /*var count = 0

    for (x in a.indices)
    {
        for (y in a.indices)
        {
            if (a[x] == a[y]) count++
        }

        if(count == 1)
            return a[x]
        else
            count = 0
    }

    return 0*/

    /** Other (better)**/
    val mySet : MutableSet<Int> = mutableSetOf()

    a.forEach{
        if (mySet.contains(it))
            mySet.remove(it)
        else
            mySet.add(it)
    }

    mySet.forEach {
        return it
    }

    return 0
    /*Set<Integer> set = new HashSet<Integer>();
    int l = 0
    for (Integer i : a){
        if(set.contains(i)) {
            set.remove(i)
        }
        else {
            set.add(i)
        }
    }*/
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//
//    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = Chalenges.lonelyinteger(a)
    val result = lonelyInteger(arrayOf(1, 1, 2, 2, 3, 4, 3))

    println(result)
}
