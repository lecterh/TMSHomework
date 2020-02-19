/*Создайте число. Определите, является ли число трехзначным. Определите, является
        ли его последняя цифра семеркой. Определите, является ли число четным.*/

package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number (3 num in number)");
        int num = sc.nextInt();
        if ((num / 1000) == 0) {
            System.out.println("yes, this is трехзначное число :)");
        }
        else
            System.out.println("No, не трехзначное число :)");

        if ((num % 10) == 7) {
            System.out.println("Yes, the last num is 7");
        }
        else
            System.out.println("No, the last num isn't 7");

        if ((num % 2) == 0) {
            System.out.println("Yes, the number is even");
        }
        else
            System.out.println("No, The number is odd");
    }
}
