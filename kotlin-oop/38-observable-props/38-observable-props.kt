// Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
// Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah

class OberservationProps(name: String){
    var name: String by Delegates.observable(name){
        property, oldValue, newValue -> 
        println("${property} changed from ${oldValue} to ${newValue}")
    }
}