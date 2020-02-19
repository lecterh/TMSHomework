/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2.
        Если нулевым, то заменить его на10. Вывести полученное число*/


package lesson23;

import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();

        if (num > 0)
            num += 1;
        else if (num < 0)
            num -= 2;
        else
            num = 10;
    }

}
