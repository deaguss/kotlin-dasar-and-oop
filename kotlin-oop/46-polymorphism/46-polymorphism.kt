ه// Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
// Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
// Polymorphism erat hubungannya dengan Inheritance

fun main(){
    var employee: Employee = Employee ("Eko")
    employee.sayHello("Budi")
    employee = Manager("Eko")
    employee sayHello("Budi")
    employee = VicePresident("Eko")
    employee sayHello("Budi")
}