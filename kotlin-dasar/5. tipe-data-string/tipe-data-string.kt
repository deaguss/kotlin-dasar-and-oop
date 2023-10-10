fun main() {
    var fullName: String = "Dede agus saputra"
    var name: String = """D
    |E
    |D
    |E""".trimMargin() // delete special char \

    """""" // for multi sentence

    var kampus: String = "stikom"

    println(fullName)
    println(name)
    println(fullName + " " + kampus)

    // string template
    var merge: String = "$fullName $kampus"
    println(merge)
    println("kampus saya di ${kampus}")
}