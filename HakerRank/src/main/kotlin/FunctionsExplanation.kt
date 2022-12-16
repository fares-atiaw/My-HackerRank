fun main(){

    /** Anonymous Function  **/
    var quickFun = fun(num : Int) : String {
        return "$num right"
    }

    /** Anonymous Function vs Lambda Function **/
    val anonymousFunction: (Int, Int) -> Int = fun(x :Int, y :Int): Int = x + y
    val lambdaFunction: (Int, Int) -> Int = { x:Int, y:Int -> x + y }

    fun repeater(times : Int , lambda: (index :Int)->Unit)
    {
        repeat(times) {
            lambda(it)
        }
        if(false xor true) println("wp")
    }

    infix fun Int.cross(value : Int) = this*value

    println(5 cross 5)

    ///////////////////////////////////////////////////////////

//    quickFun(7)
//
//    anonymousFunction(5, 9)
//    lambdaFunction(5, 9)

    repeater(5) {
        println("ggggggggg")
    }


}