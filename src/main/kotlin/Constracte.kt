class student(val name:String,val gender:String,val age:Int){

}

fun main(args: Array<String>) {
    //this is an object
    val mayobi=student("bruce", "male", 19)
    
    println("student name is ${mayobi.name} and he is ${mayobi.gender} of ${mayobi.age} years old")
}