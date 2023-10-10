// Kotlin mendukung Type Alias
// Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
// Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat tipe data sehingga kita tidak perlu menulisnya terlalu panjang

typealias Pelajar = Student
typealias Murid = Pelajar

// alias pada function

typealias App = () -> String

fun sayHello(app: App){
    println("test")
}


