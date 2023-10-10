// Recursive function adalah function yang memanggil function dirinya sendiri

// factorial loop
// fun factorialLoop(value: Int): Int {
//     var result = 1;
//     for(i in value downTo 1){
//         result *= i
//     }
//     return result
// }

// factorialRecursive, terjadi stuck overflow
// fun factorialRecursive(value: Int): Int {
//     return when(value){
//         0 -> 1
//         else -> value * factorialRecursive(value - 1)
//     }
// }

tailrec fun factorialTail(value: Int, total: Int): Int {
    return when(value){
        0 -> total
        else -> factorialRecursive(value - 1, total * value)
    }
}

fun main(){
    println(factorialTail(20))
}

