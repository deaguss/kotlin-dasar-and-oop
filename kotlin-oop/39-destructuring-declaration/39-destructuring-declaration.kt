// Destructuring declaration adalah membuat multiple variables dari sebuah object
// Destructuring tidak bisa dilakukan untuk semua object,  hanya objek yang memiliki function componentX() yang bisa dilakukan destructuring
// Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameter nya


data class Game(val name: String, val price: Int)

// Destructuring declarations juga bisa dilakukan ketika memanggil function
// Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

// Destructuring Lambda Parameter
// Destructuring juga bisa dilakukan di lambda parameter
// Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter

data class Login(val user: String, val pass: String)
typealias LoginCallback = ( Login ) -> Boolean

fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}


fun main() {
    val game = Game("Zelda", 10_000_000)

    // Destructuring Declarations
    // val (name , price) = game

    // ComponentX
    val name = game.component1()
    val price = game.component2()

    println(name)
    println(price)


    // Destructuring Return Function
    val (min, max) = minmax(100,100)
    println(min)
    println(max)

    // Destructuring Lambda Parameter
    val request = Login("arthur", "testing")
    val success = login(request){
        (user, pass) ->
        user == "arthur" && pass == "secret"
    }
}