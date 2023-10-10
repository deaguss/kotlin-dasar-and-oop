// Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
// Dalam artian, kita bisa membuat class Parent dan class Child
// Di Kotlin, tiap class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
// Secara standar, di class yang dibuat di Kotlin adalah final (tidak bisa diwariskan), agar bisa diwariskan, kita harus menggunakan kata kunci open 

open class Employee(val name: String){
    fun sayHello(name: String){
        println("Hello my name is ${name} and he is ${this.name}")
    }
}

final class Manager(name: String): Employee(name)

final class Ceo(name: String): Employee(name)

fun main() {
    val manager = Manager("Arthur")
    manager.sayHello("dede")

    val ceo = Ceo("Agus")
    ceo.sayHello("dede")

    println(manager.name)
    println(ceo.name)
}
