open class Animal(colour: String, age: Int) {
    init {
        println("colour is: $colour.")
        println("age is: $age")
    }
}
class Dog(colour: String, age: Int): Animal(colour, age) {
    fun woof() {
        println("Dog makes sounds of woof")
    }
}
class cat(colour: String, age: Int): Animal(colour, age) {
    fun meow() {
        println("Cat makes sounds of meow")
    }
}
class Horse(colour: String,age: Int): Animal(colour, age) {
    fun neigh() {
        println("Horse makes sounds of neigh")
    }
}

fun main(args: Array<String>) {
    val dogobct=Dog("browm", 2)
    dogobct.woof()
    val catobct=cat("white", 1)
    catobct.meow()
    val horseobct=Horse("brown", 3)
    horseobct.neigh()


}
