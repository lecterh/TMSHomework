/*Создать последовательность случайных чисел, найти и вывести наибольшее из них.*/

package task13;

import java.util.*;

public class Task13 {
    public static void main(String[] args) {
        int mas[] = new int[20];
        int len = mas.length;
        for (int i = 0; i < len; i++) {
            mas[i] = ((int) (Math.random() * 100));
        }
        for (int i : mas)
            System.out.printf("%d  ", i);
        Arrays.sort(mas);
        System.out.println("\n" + mas[mas.length - 1]);
    }
}
