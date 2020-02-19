/*Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.*/

package Lesson34;

import java.util.Scanner;

public class Lesson34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
