// Lambda expression secara sederhana adalah function yang tidak memiliki nama
// mirip seperti arrow function dalam js

// function references
fun toLower(value: String): String = value.toLowerCase()


fun main() {
   val lambdaName: (
    String,
    String,
    String
    ) -> String = {
    f_Name: String,
    m_Name: String,
    l_Name -> 
        val result = "${f_Name} ${m_Name} ${l_Name}".toUpperCase()
        result
    
   } 

   val lambdaName2: (String) -> String = ::toLower

   println(lambdaName2("Arthur"))

   println(lambdaName("Dede", "Agus", "Saputra"))
}