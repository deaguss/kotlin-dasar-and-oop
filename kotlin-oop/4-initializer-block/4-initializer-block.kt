class Person (
    f_name_params: String,
    l_name_params: String
){
    init {
        println("code yang dieksekusi pertaama kali ketika contructor jalan ${f_name_params} ${l_name_params}")
    }

    var f_name: String = f_name_params
    var l_Name: String = l_name_params
}

fun main() {
    val fullName = Person("Dede", "Saputra")

    println(fullName.f_name)
    println(fullName.l_Name)
}