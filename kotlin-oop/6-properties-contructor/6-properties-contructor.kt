// Kotlin mendukung deklarasi properties langsung di primary constructor
// Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties, dan mengisi datanya lewat constructor


class Person(
    val f_name: String,
    val l_name: String  
    ){

}

fun main() {
    val fullName = Person("dede", "agus")
    val fullNamed = Person(f_name = "arthur", l_name = "agus")

    println(fullName.f_name)
    println(fullNamed.f_name)
}