/*Имеется целове число (задать с помощью Random rand = new Random(); int x =
        rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        нему слово «рублей» в правильном падеже.*/

package task8;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String s;
        int val = rand.nextInt();

        if ((Math.abs(val % 100) >= 11) && (Math.abs(val % 100) <= 14)) {
            switch (val % 10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    s = "Рублей";
                    break;
                default:
                    s = "ХЗ Чего";
            }
        }
        else {
            switch (Math.abs(val % 10)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: {
                    s = "Рублей";
                    break;
                }
                case 1: {
                    s = "Рубль";
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    s = "Рубля";
                    break;
                }
                default:
                    s = "ХЗ чего";
            }
        }
        System.out.println(val + " " + s);
    }
}
