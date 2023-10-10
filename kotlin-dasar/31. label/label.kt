// Label adalah penanda 
// Semua expression di Kotlin bisa ditandai dengan label
// Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @ 


fun main() {
    loopI@ for(i in 1..10){
        loopJ@ for(j in 1..10){
           println("${1} x ${j} = ${i} * ${j}") 
           if(j == 5){
            continue@loopI
           }
        }
    }
}

// fun main(args: Array<String>) {
//     for(value in args){
//         println(value)
//     }
// }

