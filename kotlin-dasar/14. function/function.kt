fun helloWorld(f_name: String, l_name: String = ""){
    println("Hello world ${f_name} ${l_name}")
}

fun examResult(nilai: Int, sks: Int = 4){
    println("Nilai mu sementara ${nilai} dan sksnya ${sks}")
}

fun main() {
    helloWorld("dede", "agus")
    examResult(70)

}