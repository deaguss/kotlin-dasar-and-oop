fun main() {
    // array bisa valuenya null kalo pake ?
    val members: Array<String?> = arrayOf("D", "E", "D", "E")

    val index: String = members[0] // get data index 0
    val getIndex: String = members.get(0) // get data index 0
    members.set(1, "A") // set data index 1
    members[0] = "Y" // set data index 0

    println(members.size)
    // for(member in members)
    //     println(members)
    
}