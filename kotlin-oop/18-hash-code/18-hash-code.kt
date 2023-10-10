// hashCode adalah function yang digunakan sebagai representasi angka unit untuk objek yang kita buat
// Function hashCode sangat berguna saat kita ingin mengkonversi objek kita menjadi angka
// Salah satu penggunaan hashCode yang banyak dilakukan adalah di struktur data, misal untuk memastikan tidak ada data duplicate, agar lebih mudah, di cek nilai hashCode nya, jika hashCode sama, maka dianggap objectnya sama


class Company(val name: String){
    override fun hashCode(): Int {
        return this.name.hashCode()
    }

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

    println(company_1.hashCode())
    println(company_2.hashCode())
    println(company_1.hashCode() == company_2.hashCode())
}