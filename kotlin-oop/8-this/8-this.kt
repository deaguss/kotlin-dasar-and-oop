// this adalah keyword yang bisa digunakan untuk mereferensikan object saat ini
// this hanya bisa digunakan di dalam class itu sendiri
// Biasanya, this digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama

class Student(val name: String){
    fun sayHello(name: String): Unit {
        println("Hello my name is ${name}, and he is ${this.name}")
    }

}

fun main() {
    val student = Student("arthur")

    // call function
    student.sayHello(name = "robert")
    println(student.name)
}
