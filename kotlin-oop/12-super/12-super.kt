// Kadang kita ingin mengakses function atau properties milik class Parent yang sudah dibuat ulang oleh class Child
// Untuk mengakses function  atau properties milik class Parent, kita bisa menggunakan kata kunci super

open class Shape {
    open var corner: Int = -1

    open fun sayHello(){
        println("corner from parent class")
    }
}

class Rectangle: Shape() {
    override var corner: Int = 4
    val parentCorner: Int = super.corner 

    fun childClass(){
        println("corner from child class")
        super.sayHello()
    }
}

fun main() {
    val shape = Rectangle()
    println(shape.corner)
    println(shape.parentCorner)
    shape.childClass()
}