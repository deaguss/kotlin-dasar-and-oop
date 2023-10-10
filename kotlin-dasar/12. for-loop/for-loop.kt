fun main() {
    val names: Array<String?> = arrayOf("Dede", "Agus", "Saputra")

    for(name in names){
        println(name)
    }

    // looping range
    for(value in 0..100){
        println(value)
    }

    // looping dengan menggabungkan downTo dan step
    for(value in 10 downTo 0 step 5){
        println(value)
    }
}