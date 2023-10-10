// Unit adalah tanda bahwa function tersebut tidak mengembalikan apa-apa
// atau disebut void

fun fullName(name: String?): Unit {
    if(name == null) {
        println("kosong")
    }else{
        println("hello ${name}")
    }
}

fun main() {
    fullName("dede")
}