class Person (
    f_pame_params: String,
    l_name_params: String
){
    var f_name: String = f_pame_params
    var l_Name: String = l_name_params
}

fun main() {
    val fullName = Person("Dede", "Saputra")

    println(fullName)
}