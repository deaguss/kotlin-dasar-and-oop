// Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain-lain
// Kemampuan ini membuat kita bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
// Ada banyak sekali operator yang bisa di override di Kotlin

// expression       Translated To
// +a               a.unaryPlus()
// -a               a.unaryMinus()
// !a               a.not()

// others https://kotlinlang.org/docs/operator-overloading.html#increments-and-decrements

data class Fruit(val total: Int){
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
}

fun main() {
    val fruit = Fruit(100) + Fruit(100)
    println(fruit)
}