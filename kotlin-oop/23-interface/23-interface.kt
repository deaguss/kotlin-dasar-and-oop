// Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
// Interface adalah blueprint, prototype atau cetakan di Kotlin
// Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
// Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class - class turunannya
// Secara standar, semua properties dan function di Interface adalah abstract


interface AnimalProps {
    val name: String
    fun sayHello(name: String): Unit

    // Function di Interface memiliki pengecualian, tidak harus abstract
    // Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya

    fun sayGood(name: String): Unit {
        println("im good ${name}")
    }
}


// Inheritance di Class hanya boleh memiliki satu class Parent
// Di Interface, sebuah class Child bisa memiliki banyak interface Parent

interface GoProps: StopProps {
    fun Go(): Unit {
        println("Go")
    }
}

// Tidak hanya Class yang punya kemampuan Inheritance
// Interface juga bisa melakukan Inheritance dengan Interface lain
// Namun Interface tidak bisa melakukan Inheritance dengan Class

interface StopProps {
    fun Stop(): Unit {
        println("Stop")
    }
}

// konflik di interface ketika fun di dalam interface sama
interface MoveAProps {
    fun move(): Unit = println("Move A")
}

interface MoveBProps {
    fun move(): Unit = println("Move B")
}

class Animal(
    override val name: String
): AnimalProps, GoProps, MoveAProps, MoveBProps {
    override fun sayHello(name: String){
        println("my name is ${name} and my dog name is ${this.name}")
    }
    
    // Memperbaiki Konflik di Interface menggunakan override san super
    override fun move(){
        super<MoveAProps>.move()
        super<MoveBProps>.move()
    }
}

fun main() {
    val animal = Animal("betty")
    animal.sayHello("arthur")
    animal.sayGood("betty")
    animal.Go()
    animal.move()
    animal.Stop()

    println(animal.name)
}