/*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
        банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
        50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
        снимающую деньги. На вход передается сумма денег. На выход – булевское
        значение (операция удалась или нет). При снятии денег функция должна
        рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
        конструктор с тремя параметрами – количеством купюр.*/

package Task25;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ATM a1 = new ATM(6, 0, 5);
        System.out.println("Insert card...Input PIN code....Ok!");
        //В основном цикле крутимся, пока не нажмем 0 или ошибка.
        while (true) {
            System.out.println("Choice operation:" +
                    "\n1 - Show your balance;" +
                    "\n2 - Put money on balance;" +
                    "\n3 - Cash withdrawal;" +
                    "\n0 - Exit and get your card.");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.printf("In ATM %d$\n", a1.howMuchMoney());
                    a1.howMoneyBanknotes();
                    break;
                }
                case 2: {
                    System.out.println("You can put only 100$-s, 50$-s and 20$-s banknotes");
                    System.out.println("How much 100$-s?");
                    a1.add100Money(sc.nextInt());
                    System.out.println("How much 50$-s?");
                    a1.add50Money(sc.nextInt());
                    System.out.println("How much 20$-s?");
                    a1.add20Money(sc.nextInt());
                    System.out.println();
                    System.out.printf("In ATM %d$\n", a1.howMuchMoney());
                    a1.howMoneyBanknotes();
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount you want to withdraw");
                    a1.getMoney(sc.nextInt());
                    break;
                }
                case 0: {
                    System.out.println("Pick up your card!");
                    System.exit(0);
                }
                default: {
                    System.out.println("Wrong choice! Please try again.");
                }
            }
        }
    }
}
