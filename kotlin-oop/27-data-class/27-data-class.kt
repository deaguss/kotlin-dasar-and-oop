// Kadang kita sering membuat class yang hanya digunakan sebagai representasi dari data
// Data Class cocok digunakan dalam hal ini
// Data Class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString dan copy dari semua properties yang terdapat di primary constructors yang dimiliki oleh data class

data class Product(
    val name: String,
    val price: Int,
    val category: String
)

fun main() {
    val product = Product(name = "sabun", price = 2000, category = "kamar_mandi")

    // Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
    // Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya

    val product2 = product.copy()
    println(product2)
    val product3 = product.copy(price = 5000)
    println(product3)
    
}