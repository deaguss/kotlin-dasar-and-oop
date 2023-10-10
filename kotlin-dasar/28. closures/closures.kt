// Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama

fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    lambdaIncrement()
}