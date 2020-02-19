/*Даны 2 числа. Вывести большее из них*/

package lesson26;

import java.util.Scanner;

public class Lesson26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first num");
        int a = sc.nextInt();
        System.out.println("Input second num");
        int b = sc.nextInt();

        System.out.println(Integer.max(a, b));
    }
}
