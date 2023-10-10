// Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua dat


infix fun String.to(type: String): String {
    return when (type.toUpperCase()) {
        "UP" -> this.toUpperCase()
        "LOW" -> this.toLowerCase()
        else -> this
    }
}

fun main() {
    val result: String = "Dede agus" to "UP"
    println(result)
}