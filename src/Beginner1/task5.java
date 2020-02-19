/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?*/

package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input digit");
        int dig = sc.nextInt();
        int a = dig / 1000;
        int b = (dig % 1000) / 100;
        int c = ((dig % 1000) % 100) / 10;
        int d = ((dig % 1000) % 100) % 10;
        System.out.printf("a = %d b = %d c = %d d = %d\n", a, b, c, d);

        if ((a != b) && (a != c) && (a != d)) {
            if ((b != c) && (b != d)) {
                if (c != d)
                    System.out.println("True");
            }
        }
        else
            System.out.println("False");
    }
}
