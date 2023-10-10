// Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
// Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya

class App(val name: String){
    companion object{
        fun sayHello(name: String): Unit {
            println("${name}")
        }
    }
}

fun main() {
    App.Companion.sayHello("Arthur")
}