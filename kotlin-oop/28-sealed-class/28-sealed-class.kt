// Sealed class merupakan jenis class yang didesain untuk inheritance
// Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
// Sealed class sangat cocok digunakan sebagai class Parent

sealed class Operation(val name: String)
class Plus: Operation("+")
class Minus: Operation("-")

// Sealed class sangat berguna saat kita menggunakan when expression
// Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check

fun operation(
    value1: Int,
    value2: Int,
    operation: Operation
    ): Int {
        return when (operation){
            is Plus -> value1 + value2
            is Minus -> value1 - value2
        }
    }