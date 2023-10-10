// Kadang kita hanya membuat class dengan satu properties
// Terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih banyak ketika program kita berjalan
// Kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci inline

inline class Token(val value: String){
    fun toUpper(): String = value.toUpperCase()
}

fun main() {
    val login = Token("hbvwi9824bndc8")
    println(login.toUpper())
}