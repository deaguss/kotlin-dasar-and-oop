// Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func

fun hello(value: String, textTransform: (String) -> String): String {
    return "Hello ${textTransform(value)}"
}

fun main() {

    val anonymous = fun(value: String): String {
        if(value.isBlank()){
            return "kosong"
        }
        return value.toUpperCase()
    }

    // Anonymous Function as Parameter
    val result2 = hello("kocag", fun(value: String): String {
        if(value.isBlank()){
            return "kosong"
        }
        return value.toUpperCase()
    })

    val result1 = hello("Arthur", anonymous)
    println(result1)
    println(result2)
}