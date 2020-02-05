package Clients

/**
 * Created by User on 05 Февр., 2020
 */
abstract class Client(val captionClient: String) {
    var amount: Double = 0.0
    abstract fun topUp(_amount: Double)
    abstract fun withDraw(_amount: Double)
    fun showBalance() {
        println("$captionClient: баланс счета составляет $amount")
    }
}