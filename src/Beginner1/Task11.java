/*Имеется целое число, определить является ли это число простым, т.е.
        делится без остатка только на 1 и себя.*/

package task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();
        boolean isSimple = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isSimple = false;
            }
        }
        if (isSimple) {
            System.out.printf("The number %d is simple", num);
        } else {
            System.out.printf("The number %d is not simple", num);
        }
    }
}
