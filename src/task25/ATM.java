package Task25;

public class ATM {
    //Количество банкнот покупюрно
    private int bill100;    //100$
    private int bill50;     //50$
    private int bill20;     //20$

    //Сколько и каких банкнот нужно выдать
    private int c100;   //100$
    private int c50;    //50$
    private int c20;    //20$

    //Сколько и каких банкнот выдано
    private int get100;     //100$
    private int get50;      //50$
    private int get20;      //20$

    //Выводит на экран сколько и каких банкнот есть в банкомате
    public void howMoneyBanknotes() {
        System.out.printf("100$ = %d, 50$ = %d, 20$ = %d\n", bill100, bill50, bill20);
    }

    //Конструктор (принимает 3 параметра: кол-во 100$, 50$ и 20$)
    public ATM(int bill100, int bill50, int bill20) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    //Метод добавляет в банкомат count(количество) купюр 20$
    public void add20Money(int count) {
        bill20 += count;
    }

    //Метод добавляет в банкомат count(количество) купюр 50$
    public void add50Money(int count) {
        bill50 += count;
    }

    //Метод добавляет в банкомат count(количество) купюр 100$
    public void add100Money(int count) {
        bill100 += count;
    }

    //Выводит на экран сумму всех денег в банкомате
    public Integer howMuchMoney() {
        return bill20 * 20 + bill50 * 50 + bill100 * 100;
    }

    //Снимаем необходимое количество (c100) 100$ купюр.
    //Если купюр 100$ не хватает - снимаем сотку 50$ купюрами
    //Если и этих не хватает - снимаем сотку 20$ купюрами
    public void get100() {
        while (c100 != 0) {
            if (bill100 != 0) {
                bill100--;
                c100--;
                get100++;
            } else if (bill50 > 1) {
                bill50 -= 2;
                c100--;
                get50 += 2;
            } else if (bill20 > 4) {
                bill20 -= 5;
                c100--;
                get20 += 5;
            } else {
                System.out.println("Something wrong...");
                System.exit(-1);
            }
        }
    }

    //Снимаем необходимое количество (c50) 50$ купюр
    public void get50() {

        get50 += c50;
        bill50 -= c50;
        c50 = 0;

    }

    //Снимаем необходимое количество (c20) 20$ купюр
    public void get20() {

        get20 += c20;
        bill20 -= c20;
        c20 = 0;

    }

    //Проверяем, сможем ли снять введенную сумму. Проверки:
    //-есть ли столько денег в банкомате
    //-минимальная сумма (купюра) 20$
    //-сумма должна делиться на кратность купюр
    //-есть ли нужное количество каждых купюр (к примеру, если в банкомате купюры
    //      только 100$ и 20$, то, допустим, 170$ снять не сможем,
    //      т.к. нет купюр по 50$)
    //-хватит ли банкнот для выдачи сотых (к примеру, если нужно снять
    //      500$ а купюр по 100$ не хватает, то проверяем, хватит ли
    //      купюр по 50$ и купюр по 20$ чтобы выдать сотые)
    public boolean isCanGet(int sum) {
        System.out.printf("You want to get %d$\n", sum);
        if (howMuchMoney() < sum) {
            System.out.println("Not enough money");
            return false;
        } else if (sum < 20) {
            System.out.println("Minimum amount 20$");
            return false;
        } else if ((sum - c100 * 100 - c50 * 50) % 20 != 0) {
            System.out.println("Must be a multiple of 20");
            return false;
        } else if ((c100 > bill100) && (c100 - bill100 > 2 * bill50) && (c100 - bill100 - 2 * bill50 > 5 * bill20)) {
            System.out.println("Not enough banknotes");
            return false;
        } else if (c50 > bill50) {
            System.out.println("Not enough 50$-s banknotes");
            return false;
        } else if (c20 > bill20) {
            System.out.println("Not enough 20$-s banknotes");
            return false;
        } else {
            return true;
        }
    }

    //Разбиваем введенную сумму на купюры по 100$(c100), 50$(c50) и 20$(c20)
    //К примеру ввели 540$ - это 5 по 100$ и 2 по 20$
    public void sortByBanknotes(int sum) {
        c100 = sum / 100;
        if ((sum - c100 * 100) % 50 == 0) {
            c50 = (sum - c100 * 100) / 50;
        } else if (((sum - c100 * 100) % 50) % 20 == 0) {
            c50 = (sum - c100 * 100) / 50;
            c20 = (sum - c100 * 100 - c50 * 50) / 20;
        } else if ((sum - c100 * 100) % 20 == 0) {
            c50 = 0;
            c20 = (sum - c100 * 100) / 20;
        } else {
            System.out.println("Can't drop this sum by banknotes");
        }
    }

    //Очищаем счетчики выданных купюр (get100, get50, get20)
    public void clearGetCount() {
        get20 = 0;
        get50 = 0;
        get100 = 0;
    }

    //Метод выдачи денег. Если все проверки прошли успешно - деньги выдались
    //Если нет - ошибка.
    public void getMoney(int sum) {
        sortByBanknotes(sum);
        if (isCanGet(sum)) {
            get100();
            get50();
            get20();
            System.out.println("Operation completed successfully");
            System.out.printf("You took: 100$ = %d, 50$ = %d, 20$ = %d\n", get100, get50, get20);
        } else {
            System.out.println("Operation could not be performed");
        }
        clearGetCount();
    }
}
