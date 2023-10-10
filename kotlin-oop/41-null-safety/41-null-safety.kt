// Jika teman-teman sebelumnya pernah belajar bahasa pemrograman Java, di Java kita sering mengenal error bernama NullPointerException. Error ini terjadi ketika kita mengakses properties atau functions di null object
// Di Kotlin, hal ini sangat jarang terjadi, karena sejak awal di Kotlin tidak direkomendasikan untuk menggunakan nullable type. 
// Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit menggunakan karakter ? (tanda tanya)
// Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering kejadian seperti di Java


data class Friend(val name: String)

// Safe Call Menggunakan ?
fun sayHello(friend: Friend): Unit {

    //elvis operator
    val name = friend?.name ?: ""

    // kata kunci !! untuk mengkonversi dari data yang nullable menjadi data tidak nullable

    val example = frined!!.name
    println("Hello ${friend?.name}")
}