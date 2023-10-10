// Di Kotlin, kita bisa membuat class (Inner) di dalam class (Outer)
// Namun walaupun class Inner tersebut berada di dalam class Outer, namun class Inner tidak bisa mengakses data yang ada di dalam class Outer
// Agar class Inner bisa mengakses data yang ada di dalam class Outer, kita bisa menggunakan kata kunci inner


class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun hi() {
            println("Hi, I'm ${name}, and here is my boss ${this@Boss.name}")
        }
    }
}

fun main() {
    val boss = Boss("John")
    val employee = boss.Employee("Alice")
    employee.hi()
}
