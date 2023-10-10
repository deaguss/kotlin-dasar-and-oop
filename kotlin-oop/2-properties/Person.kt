class Person {
    var f_name: String = ""
    var l_Name: String = ""
}

fun main() {
    val fullName = Person()
    fullName.f_name = "Dede"
    fullName.l_Name = "Agus"

    println(fullName.f_name)
}