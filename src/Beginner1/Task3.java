/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд.
        по аналогии с примером выше.*/

package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int digit = 4500;
        int sec = 0;
        int min = 0;
        int hour = 0;
        int day = 0;
        int week = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number of display format:" +
                "\n1 - Min + Sec" +
                "\n2 - Hour + Min + Sec" +
                "\n3 - Day + Hour + Min + Sec" +
                "\n4 - Week + Day + Hour + Min + Sec" +
                "\nYour choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                sec = digit % 60;
                min = digit / 60;
                System.out.printf("4500 sec = %d min %d sec", min, sec);
                break;
            }
            case 2: {
                sec = digit % 60;
                int tmpMin = digit / 60;
                min = tmpMin % 60;
                hour = tmpMin / 60;
                System.out.printf("4500 sec = %d Hour %d Min %d Sec", hour, min, sec);
                break;
            }
            case 3: {
                sec = digit % 60;
                int tmpMin = digit / 60;
                min = tmpMin % 60;
                int tmpHour = tmpMin / 60;
                day = tmpHour / 24;
                hour = tmpHour % 24;
                System.out.printf("4500 sec = %d Day %d Hour %d Min %d Sec",day, hour, min, sec);
                break;
            }
            case 4: {
                sec = digit % 60;
                int tmpMin = digit / 60;
                min = tmpMin % 60;
                int tmpHour = tmpMin / 60;
                int tmpDay = tmpHour / 24;
                hour = tmpHour % 24;
                week = tmpDay / 7;
                day = tmpDay % 7;
                System.out.printf("4500 sec = %d Week %d Day %d Hour %d Min %d Sec",week, day, hour, min, sec);
                break;
            }
        }
    }
}
