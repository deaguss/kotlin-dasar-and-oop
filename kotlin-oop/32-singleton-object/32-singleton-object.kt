// Salah satu konsep Design Pattern yang sangat populer adalah singleton object
// Singleton object adalah object yang hanya dibuat satu kali
// Di Kotlin, membuat object singleton sangat mudah, hanya dengan menggunakan kata kunci object
// Cara membuat singleton object di Kotlin sama seperti membuat class
// Singleton object mirip dengan class, bisa extends class ataupun interface
// Namun singleton object tidak memiliki constructors

object Utils{
    val name = "Utils"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}

// Di Kotlin, singleton object bisa dibuat di dalam sebuah class
// Namun berbeda dengan inner class, singleton object tidak bisa mengakses properties atau function yang ada di outer class nya

class App(val name: String){
    object Utils {
        fun sayHello(name: String): Unit {
            println("Hello ${name}")
        }
    }
}

fun main() {
    val result = Utils.toUpper("arthur")
    val innerObj = App.Utils.sayHello("agus")
    
    println(result)
}