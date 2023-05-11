class eMobiliers{

    //data memeber
    var num:Int=6
    //Member function
    fun Hesabu():Int{
        return num*num
    }
}

fun main(args: Array<String>) {
    //Create object
    var objc=eMobiliers()
    println(objc.Hesabu())
}