// Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang  lengkap
// Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
// Bahkan, di Kotlin, kisa bisa membuat object dari interface
// Kemampuan ini dinamakan anonymous class
// Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan deklarasi class Child seperti pada pewarisan

// interface action
interface Action {
    fun action(): Unit
}

fun fireAction(action: Action){
    action.action()
}

fun main() {
    fireAction(object: Action {
        override fun action() = println("Action one")
    })

    fireAction(object: Action {
        override fun action() = println("Action two")
    })
}