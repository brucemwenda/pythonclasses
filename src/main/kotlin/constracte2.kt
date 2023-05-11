class me(val name:String,val school :String,val age:Int){




}
fun main(args: Array<String>) {
    //this is an object
    val obj=me("bruce", "matungulu boys", 18)
    println("student name is ${obj.name} and he was in ${obj.school} at ${obj.age} year")


}