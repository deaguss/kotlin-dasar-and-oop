// Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array

fun result(name: String, vararg nilai: Int){
    var result: Double = 0.0 

    for(nilai in nilai){
        result += nilai
    }

    println("Hello ${name} nilaimu ${result}")
}

fun main() {
    result("agus", 10,10,10)
}