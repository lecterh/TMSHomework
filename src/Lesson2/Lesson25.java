/*Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.*/

package lesson25;

import java.util.Scanner;

public class Lesson25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posCount = 0;
        int negativeCount = 0;
        System.out.println("Input fist num");
        int a = sc.nextInt();
        System.out.println("Input second num");
        int b = sc.nextInt();
        System.out.println("Input third num");
        int c = sc.nextInt();

        if (a > 0)
            posCount++;
        if (a < 0)
            negativeCount++;

        if (b > 0)
            posCount++;
        if (b < 0)
            negativeCount++;

        if (c > 0)
            posCount++;
        if (c < 0)
            negativeCount++;

        System.out.printf("Positive number = %d, negative number = %d", posCount, negativeCount);
    }
}
