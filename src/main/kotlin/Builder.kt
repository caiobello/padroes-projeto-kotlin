/*O Design Pattern "Builder" é uma técnica utilizada para criar objetos complexos passo a passo, separando o processo de construção da representação final do objeto. Isso ajuda a melhorar a legibilidade e a flexibilidade do código, especialmente quando você precisa criar objetos com muitos parâmetros ou configurações diferentes.*/
class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
    val customerName: String,
    val products: List<Product>,
    val total: Double,
    val deliveryAddress: String
) {
    class Builder {
        private var customerName: String = ""
        private var products: MutableList<Product> = mutableListOf()
        private var deliveryAddress: String = ""

        fun setCustomerName(name: String) = apply { customerName = name }
        fun addProduct(product: Product) = apply { products.add(product) }
        fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

        fun build(): CustomOrder {

            val total = products.sumByDouble { it.price * it.quantity }
            return CustomOrder(customerName, products, total, deliveryAddress)
        }
    }

    fun printReceipt() {
        println("${this.customerName}")
        this.products.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
        }
        println("Total: ${this.total}")
        println("End: ${this.deliveryAddress}")
    }
}

fun main() {
    val customerName = readLine() ?: ""

    val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

    val numProducts = readLine()?.toIntOrNull() ?: 0
    for (i in 1..numProducts) {
        val productName = readLine() ?: ""
        val productPrice = readLine()?.toDoubleOrNull() ?: 0.0
        val productQuantity = readLine()?.toIntOrNull() ?: 0

        orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
    }

    val deliveryAddress = readLine() ?: ""

    val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

    customOrder.printReceipt()
}
