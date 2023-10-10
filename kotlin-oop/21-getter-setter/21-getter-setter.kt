// Di bahasa pemrograman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
// Getter adalah function yang dibuat untuk mengambil data properties
// Setter ada function untuk mengubah data propertie
// Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya, karena sudah difasilitasi sehingga lebih mudah

// Getter dan Setter tidak wajib dideklarasikan semua di Kotlin
// Kita bisa hanya mendeklarasikan hanya Getter atau hanya Setter

class Note(title: String){
    var title: String = title
    get() = field // getter

    set(value){ // setter
        if(value.isNotBlank()){
            field = value
        }
    }
}

fun main() {
    val note = Note("i want to be like this")

    println(note.title)
}