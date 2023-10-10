// Constructor yang utama yang terdapat di Class, disebut primary constructor, constructor tambahan yang bisa kita buat lagi adalah secondary constructor
// Saat membuat constructor, kita wajib memanggil primary constructor jika ada primary constructor


// secondary contructor
class Person(
    f_name_params: String,
    l_name_params: String
) {
    constructor(f_name_params: String, m_name_params: String, l_name_params: String) : this(f_name_params, l_name_params) {
        println("Secondary constructor 1")
    }

    constructor(f_name_params: String) : this(f_name_params, "") {
        println("Secondary constructor 2")
    }

    var f_name: String = f_name_params
    var m_name: String = ""
    var l_name: String = l_name_params
}

// Tanpa Primary Constructor
class Toko {
    var items: String = ""
    var category: String = ""
    var isPaid: Boolean = false
    var order: String = ""

    constructor(item_params: String, category_param: String, isPaid_param: Boolean) {
        items = item_params
        category = category_param
        isPaid = isPaid_param

        println("secondary contructor 1")
    }

    constructor(item_params: String, category_param: String, isPaid_param: Boolean, order_param: String) : this(item_params, category_param, isPaid_param) {
        order = order_param

        println("secondary contructor 2")
    }
}

fun main() {
    // val fullName = Person("Dede", "Saputra")
    // val shortName = Person("Arthur")

    // println(fullName.f_name)
    // println(fullName.l_name)
    // println(shortName.f_name)
    // println(shortName.l_name)

    var keranjang = Toko("sabun", "kamar_mandi", false)
    var order = Toko("sabun", "kamar_mandi", false, "10.000")

    println(keranjang.items)
    println(keranjang.category)
    println(keranjang.isPaid)
    println(keranjang.order)

    println(order.items)
    println(order.category)
    println(order.isPaid)
    println(order.order)
}
