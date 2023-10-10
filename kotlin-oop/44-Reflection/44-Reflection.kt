// Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
// Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan 
// Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class, atau bisa langsung dari NamaClass::class

val sample = Sample
val clazz = sample::class
val constructors = clazz.constructors
val functions = clazz.memberFunctions
val parameters = clazz.memberProperties
val annotations = clazz.annotations
