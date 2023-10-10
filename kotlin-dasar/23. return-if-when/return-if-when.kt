// Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai dalam if atau when

fun sayHello(name: String = ""): String {
    return if (name == "") {
        "hello brother"
    } else {
        "Hello $name"
    }
}

fun sum(sks: Int, vararg nilai: Int): String {
    return when(nilai) {
        0 -> "nilai mu belum dimasukkan"
        else -> "nilaimu ${nilai}"
    } 
}

fun main() {
    println(sayHello("arthur"))
    println(sum(4, 10, 70, 80))
}
