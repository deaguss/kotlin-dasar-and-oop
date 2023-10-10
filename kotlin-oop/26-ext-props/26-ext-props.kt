// Selain function, kita juga bisa membuat extension untuk properties di Kotlin
// Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter

class Student(val name: String, private val age: Int)

val Student.upperName: String
    get() = this.name.toUpperCase()

fun main() {
    val student: Student = Student("arthur", 18)
    println(student.upperName)
}