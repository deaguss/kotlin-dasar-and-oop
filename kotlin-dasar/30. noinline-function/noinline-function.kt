// Saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
// Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline

// @ label
inline fun hello(
    name: () -> String,
    noinline l_Name: () -> String
): String{
    return "Hello ${name()} ${l_Name()}"
}

fun main() {
    @inline println(hello({ "arthur" }, { "lamus" }))
    @inline println(hello({ "dede" }, { "agus" }))
}