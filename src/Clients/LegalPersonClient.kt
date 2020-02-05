package Clients

/**
 * Created by User on 05 Февр., 2020
 */
class LegalPersonClient(captionClient: String) : Client(captionClient) {
    override fun topUp(_amount: Double) {
        if (_amount < 0) {
            println("Нельзя пополнить счет отрицательной суммой!")
            return
        }
        amount += _amount
    }

    override fun withDraw(_amount: Double)    {
        if (_amount < 0){
            System.out.println("Нельзя снять со счета отрицательную сумму!");
            return;
        }
        var currentAmount = 1.01 * _amount;
        if (amount < currentAmount)
        {
            System.out.println("Средств счета недостаточно для снятия");
        } else amount -= currentAmount;
    }
}