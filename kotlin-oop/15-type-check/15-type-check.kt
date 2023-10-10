// is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
// !is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu
// Setelah kita melakukan pengecekan menggunakan is, maka secara otomatis tipe data yang kita cek akan berubah menjadi tipe data yang kita check

class Laptop(val brand: String)
class Computer(val brand: String)

// Kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
// Namun konversi menggunakan as sangat tidak aman jika ternyata tipe datanya tidak sesuai

fun printObject(any: Any){
    val value = any as String //  example

    // Penggunaan as sangat tidak aman, namun kadang bisa menjadikannya aman, dengan menggunakan kata kunci as?
    // Dengan menggunakan kata kunci as? secara otomatis jika gagal melakukan konversi, akan diubah menjadi null

    val value2 = any as? String

    // cast di if
    if(any is Laptop){
        println("(if) Laptop ${any.brand}")
    }else if(any is Computer){
        println("(if) Computer ${any.brand}")
    }else {
         println(any)
    }

    // cast di when
    when(any){
        is Laptop -> println("(when) laptop ${any.brand}")
        is Computer -> println("(when) Computer ${any.brand}")
    }
}



fun main() {
    val laptop = Laptop("axioo")
    println(laptop.brand)
    val print = printObject(laptop.brand)

    println(print)
}

