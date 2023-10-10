// Kata kunci super tidak hanya bisa digunakan untuk mengakses function atau properties di class Parent
// Kata kunci super juga bisa digunakan untuk mengakses constructor class Parent
// Mengakses constructor class Parent hanya bisa dilakukan di dalam constructor class Child

open class Student(
    val name: String, // Y
    val age: Int,
    val nim: Int
    ){
        constructor(
            name: String,
            age: Int
            ): this(name, age, 0) // X

            constructor(
                name: String
                ): this(name, 0)

}

class Detail: Student {
    constructor(name: String, age: Int): super(name, age) // X

    constructor(name: String, age: Int, nim: Int): super(name,age, nim) // Y
}

fun main() {
    val student = Detail("arthur", 18)
    val studentDetail = Detail("arthur", 18, 220040001)

    // output X
    println(student.name)
    println(student.age)
    println(student.nim)

    // output Y
    println(studentDetail.name)
    println(studentDetail.age)
    println(studentDetail.nim)
}