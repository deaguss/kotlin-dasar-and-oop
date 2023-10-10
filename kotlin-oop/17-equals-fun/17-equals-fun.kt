// Di Kotlin, semua objek bisa dibandingkan menggunakan operasi == atau !=
// Saat kita membandingkan objek menggunakan operasi == atau !=, sebenarnya Kotlin akan menggunakan function equals milik class Any
// Untuk mengubah cara membandingkannya, kita bisa meng-override function equals milik class Any

class Company(val name: String){
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> this.name == other.name
            else -> false
        }
    }
}

fun main() {
    val company_1 = Company("Dede")
    val company_2 = Company("Dede")

    println(company_1 == company_2)
}