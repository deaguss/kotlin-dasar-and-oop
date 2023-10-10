// Function Overloading adalah kemampuan membuat function dengan nama yang sama di dalam class
// Untuk membuat function dengan nama yang sama, kita wajib menggunakan parameter yang berbeda, bisa tipe parameter yang berbeda, atau jumlah parameter yang berbeda


class Student(val name: String){
    fun sayHello(age: Int): Unit {
        println("Hello my name is ${name}, im ${age} y`o right now")
    }

    // function overloading
    fun sayHello(age: Int, born: String): Unit {
        println("Hello my name is ${name}, im ${age} y`o right now, i born in ${born}")
    }
}

fun main() {
    val student = Student("arthur")

    // call function
    student.sayHello(age = 18)
    student.sayHello(age = 19, born = "jakarta")
    println(student.name)
}