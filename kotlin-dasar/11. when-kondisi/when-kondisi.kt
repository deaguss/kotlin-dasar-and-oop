fun main() {
    val nilai: Char = 'S'

    when(nilai){
        'S','A' -> println("nilai tinggi")
        'B' -> println("nilai bagus")
        'C' -> println("nilai standar")
        'D' -> println("tidak lulus")
        else -> { println("dapat surat cinta dari kaprodi") }
    }

    // pengecekan value dalam when
    val choice: String? = "bhs asing"
    val kelas: Array<String?> = arrayOf("bhs asing", "c plus", "pkn")

    when(choice){
        in kelas -> println("kelas tersedia") // if
        !in kelas -> println("kelas tidak tersedia") // else
    }

    // pengecekan tipe data
    when(choice){
        is String -> println("ini string")
        !is String -> println("ini bukan string")
    }

    // validasi value dalam when

    val result: Int = 60
    when {
        result > 70 -> {
            println("kerja bagus")
        }
        else -> {
            println("bego njir")
        }
    }
}