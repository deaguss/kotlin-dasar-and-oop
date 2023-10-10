// Saat membuat program, kita pasti akan selalu berhadapan dengan error
// Banyak sekali jenis error, baik itu error yang sudah diduga, seperti validation error, atau error yang tidak terduga, seperti ada jaringan error, koneksi ke database error, dan lain-lain
// Error di Kotlin direpresentasikan dengan Exception, dimana semua tipe data error pasti akan selalu class turunan dari Throwable
// Untuk membuat error di Kotlin sangatlah mudah, kita bisa menggunakan kata kunci throw, diikuti dengan object error nya


try {
    println("hello")
}
catch(error: ValidationException) {
    println("Error with message ${error.message}")
} finally {
    println("end")
}