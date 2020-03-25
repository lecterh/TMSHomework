/*Создать иерархию классов, описывающих банковские карточки.
        Иерархия должна иметь хотя бы три уровня.*/

package Task27;

public class Runner {
    public static void main(String[] args) {
        CreditCard cCard = new CreditCard(123123, 560.43, "Ivanov Ivan",
                Currency.BYN, 1000.0, 12.4);
        DebitCard debitCard = new DebitCard(32323, 689.98, "Petrov Petya",
                Currency.EUR);

        if (cCard.withdrawCash(600.00)) {
            System.out.println("Удачно");
        } else {
            System.out.println("Не удачно");
        }
    }
}
