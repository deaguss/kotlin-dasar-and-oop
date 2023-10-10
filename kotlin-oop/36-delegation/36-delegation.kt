// Salah satu design pattern lain yang populer adalah Delegation
// Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
// Kotlin mendukung delegation tanpa harus membuat kode secara manual


interface Base {
    fun sayHello(name: String)
}

class MyBase: Base {
    override fun sayHello(name: String){
        println("Hello $name")
    }
}

// delegation manual
class Delegate(val base: Base): Base {
    override fun sayHello(name: String){
        base.sayHello(name)
    }
}

// delegation
class Delegation(val base: Base): Base by base

// delegation override
class Delegation2(val base: Base): Base by base {
    override fun sayHello(name: String){
        base.sayHello(name)
    }
}


fun main() {
    val myBase = MyBase()
    val delegate1 = Delegation(myBase)
    val delegate2 = Delegate(myBase) // hasilnya sama dan lebih efisien

    delegate.sayHello("Arthur")
}