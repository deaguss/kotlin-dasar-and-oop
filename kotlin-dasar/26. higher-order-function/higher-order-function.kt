// Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function

fun hello(value: String, textTransform: (String) -> String): String {
    return "Hello ${textTransform(value)}"
}

fun main() {
    // Higher-Order Function
    val upperCase = { value: String -> value.toUpperCase() }
    val lowerCase = { value: String -> value.toLowerCase() }

    // Trailing Lambda
    val result1 = hello("Arthur") {
        value: String -> value.toUpperCase()
    }

    println(result1)

    println(hello("Dede", lowerCase))
}