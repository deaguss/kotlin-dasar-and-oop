fun main() {
    var age: Byte = 20 // 8 bits
    var height: Int = 170 // 16 bits
    var distance: Short = 2000 //32 bits
    var balance: Long = 100_000_000 //64 bits


    // floating point
    var float: Float = 32.9F // 32 bits
    var double: Double = 64.00 // 64 bits


    // literal
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(age)
    println(height)
    println(distance)
    println(balance)

    println(float)
    println(double)

    println("decimal: " + decimalLiteral + "\nhexadecimal: " + hexadecimalLiteral + "\nbinary: " + binaryLiteral)
}