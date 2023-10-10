// Di Kotlin, semua class yang kita buat tanpa class Parent, sebenarnya secara otomatis dia akan menjadi class child dari class Any
// Any adalah superclass untuk semua class yang kita buat di Kotlin

class Laptop(val brand: String)
class Computer(val brand: String)

fun main() {
    val laptop = Laptop("axioo")
    println(laptop.brand)
}