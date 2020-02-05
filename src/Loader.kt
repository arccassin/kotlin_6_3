import Clients.IndividualEntrepreneurClient
import Clients.LegalPersonClient
import Clients.NaturalPersonClient
import com.sun.tools.javac.Main

/**
 * Created by User on 05 Февр., 2020
 */

fun main(){
    val naturalPersonClient = NaturalPersonClient("Счет физического лица")
    naturalPersonClient.topUp(10000.0)
    naturalPersonClient.withDraw(1000.0)
    naturalPersonClient.showBalance()

    val legalPersonClient = LegalPersonClient("Счет юридического лица")
    legalPersonClient.topUp(10000.0)
    legalPersonClient.withDraw(1000.0)
    legalPersonClient.showBalance()

    val individualEntrepreneurClientonClient = IndividualEntrepreneurClient(
        "Счет индивидуального предпринимателя")
    individualEntrepreneurClientonClient.topUp(900.0)
    individualEntrepreneurClientonClient.withDraw(100.0)
    individualEntrepreneurClientonClient.showBalance()
}