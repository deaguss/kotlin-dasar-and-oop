// Selain membuat ulang function di class Child, di Kotlin juga kita bisa membuat ulang properties
// Secara standar, properties di class bersifat final, tidak bisa di buat ulang di class Child nya, agar bisa dibuat ulang, kita harus menggunakan kata kunci open

open class Shape {
    open var corner: Int = -1
}

class Rectangle: Shape() {
    override var corner: Int = 4
}

fun main() {
    val shape = Rectangle()
    println(shape.corner)
}