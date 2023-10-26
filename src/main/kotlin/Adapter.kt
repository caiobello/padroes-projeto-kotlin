/*O padrão de projeto Adapter é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um intermediário, adaptando a interface de uma classe para outra interface esperada pelo cliente.*/

// Classe de conversão que suporta a conversão de USD para GBP e GBP para EUR
class CurrencyConverter {
    // Taxas de conversão
    private val usdToGbpRate = 0.80
    private val gbpToEurRate = 1.0625

    // Converte USD para GBP
    fun convertUSDtoGBP(amount: Double): Double {
        return amount * usdToGbpRate
    }

    // Converte GBP para EUR
    fun convertGBPtoEUR(amount: Double): Double {
        return amount * gbpToEurRate
    }
}

class CurrencyAdapter(private val converter: CurrencyConverter) {

    fun convertUSDtoEUR(amount: Double): Double {

        val amountInGBP = converter.convertUSDtoGBP(amount)


        val amountInEUR = converter.convertGBPtoEUR(amountInGBP)

        return amountInEUR
    }
}

fun main() {
    val input = readLine()?.toDoubleOrNull() ?: return
    val converter = CurrencyConverter()
    val adapter = CurrencyAdapter(converter)

    val amountInEUR = adapter.convertUSDtoEUR(input)

    println("USD: $input")
    println("EUR: $amountInEUR")
}
