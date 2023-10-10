// Saat kita membuat class yang abstract, kita bisa membuat properties abstract dan function abstract di dalam class tersebut
// Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class Child nya


abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat: Animal() {
    override val name: String = "cat"
    override fun run(){
        println("cat run!")
    }
}

fun main() {
    val cat = Cat()
    println(cat.name)
    println(cat.run())
}