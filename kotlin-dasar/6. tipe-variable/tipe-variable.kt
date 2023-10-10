    // membuat variable global
    const val GET_USER_NAME = "arthur"

fun main() {
    // var untuk mutable (value bisa diubah)
    // val untuk immutable (value tidak bisa diubah)
    
    var name: String = "hello world"
    val named: String = "galaxy destroyer"

    // name = "hello galaxy"
    // named = "princess helper" // error

    println(name)
    println(named)

    // cara agar variable bisa null
    var nullable: String? = ""
    println(nullable?.length)


    println("welcome back ${GET_USER_NAME}")

}