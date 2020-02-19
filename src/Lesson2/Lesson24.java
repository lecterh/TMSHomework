/*Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.*/

package lesson24;

import java.util.Scanner;

public class Lesson24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Input fist num");
        int a = sc.nextInt();
        System.out.println("Input second num");
        int b = sc.nextInt();
        System.out.println("Input third num");
        int c = sc.nextInt();

        if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;

        System.out.println(count + " positive num");
    }
}
