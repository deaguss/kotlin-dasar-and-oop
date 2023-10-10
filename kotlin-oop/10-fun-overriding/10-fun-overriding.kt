// Function Overriding adalah kemampuan membuat ulang function yang sudah ada di class Parent
// Secara standar, function di class adalah final, tidak bisa dibuat ulang di class Child
// Agar function bisa dibuat ulang di class Child, kita harus menggunakan kata kunci open

open class Employee(val name: String){
    open fun sayHello(name: String){
        println("Hello my name is ${name} and he is ${this.name}")
    }
}

// Saat kita membuat ulang function di class Child, secara standar, function tersebut bersifat open, yang artinya bisa dibuat ulang di class Child dibawahnya lagi
// Jika ingin membuat override function tidak bisa dibuat ulang oleh class Child dibawahnya lagi, kita harus menggunakan kata kunci final


final class Manager(name: String): Employee(name){

    // membuat ulang function
    // add final
    final override fun sayHello(name: String){
        println("Hello my name is ${name} and he is manager ${this.name}")
    }
}


fun main() {
    val manager = Manager("Arthur")
    manager.sayHello("dede")

    println(manager.name)
}
