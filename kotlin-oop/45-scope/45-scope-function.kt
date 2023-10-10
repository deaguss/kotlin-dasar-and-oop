// Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi object dengan mudah memanfaatkan lambda expression
// Function-function tersebut adalah let, run, with, apply, dan also


// let function
// Let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
// Let function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci it untuk mendapatkan referensi terhadap object tersebut



fun main () {
    val student = Student("dede", 30)
    student.let {
        println(it.name)
        println(it.age)
    }
}

// Run Function
// Run function mirip dengan let function
// Yang membedakan adalah, pada run function, tidak ada parameter pada lambda nya, sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it. Namun kita masih bisa menggunakan kata kunci this

fun main () {
    val student = Student("Eko", 30)
    student.run {
        println(this.name)
        println (this.age)
    }
}

// others https://kotlinlang.org/docs/scope-functions.html