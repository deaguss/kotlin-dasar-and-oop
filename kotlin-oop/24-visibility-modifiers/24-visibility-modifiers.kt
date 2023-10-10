// Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
// Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
// Secara standar visibility modifiers di kotlin adalah public

// public = Jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari manapun
// private = Artinya hanya bisa diakses di tempat deklarasinya
// protected = Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
// internal = Artinya hanya bisa diakses di module/project yang sama.

class Animal {
    private fun move(): Unit = println("Move position")
    protected fun stop(): Unit = println("stop")
    internal fun jump(): Unit = println("jump")
}

fun main() {
    val animal = Animal()
    animal.move() // error
    animal.stop() // error
    animal.jump() // success
}