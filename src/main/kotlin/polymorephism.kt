open class Shape{
    open fun draw(){
        println("Drawing shape")
    }
}class Circle:Shape(){
    override fun draw() {
        println("Drawing a circle")
    }

}
class square:Shape(){
    override fun draw() {
        println("Drawing a square")
    }
}
class Tringle:Shape(){
    override fun draw() {
        println("Drawing a Tringle ")
    }

}

fun main(args: Array<String>) {
    val Shapes:Array<Shape> = arrayOf(Circle(),square(),Tringle())
    for (shape in Shapes){
        shape.draw()
    }
}
