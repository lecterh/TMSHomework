/*Найдите сумму первых n целых чисел, которые делятся на 3.*/

package task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N");
        int n = sc.nextInt();
        int res = 0;

        for (int i = 1; ; i++) {
            if (n == 0)
                break;
            else if (i % 3 == 0) {
                res += i;
                n--;
            }
        }
        System.out.println(res);
    }
}
