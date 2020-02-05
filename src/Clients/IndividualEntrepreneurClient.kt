package Clients

/**
 * Created by User on 05 Февр., 2020
 */
class IndividualEntrepreneurClient(captionClient: String) : Client(captionClient) {
    override fun topUp(_amount: Double) {
        if (_amount < 0) {
            println("Нельзя пополнить счет отрицательной суммой!")
            return
        }

        if (amount < 1000) {
            amount += _amount * 0.99
        } else
            amount += _amount * 0.995
    }

    override fun withDraw(_amount: Double) {
        if (_amount < 0) {
            println("Нельзя снять со счета отрицательную сумму!")
            return
        }
        if (amount < _amount) {
            println("Средств счета недостаточно для снятия")
        } else
            amount -= _amount
    }
}