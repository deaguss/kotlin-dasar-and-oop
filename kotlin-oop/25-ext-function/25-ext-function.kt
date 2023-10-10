// Perlu diperhatikan, bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
// Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private atau protected dari class tersebut

class Student(val name: String, private val age: Int)

fun Student.sayHello(name: String): Unit {
    println("hi ${name}, im ${this.age}") //  error
}

// Secara standar, extension function hanya bisa untuk data yang tidak null
// Jika kita ingin membuat extension function yang bisa digunakan untuk data yang bisa null, kita perlu menggunakan kata kunci ? (tanda tanya)

fun Student?.other(): Unit
