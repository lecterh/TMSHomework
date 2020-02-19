/*Создать массив, заполнить его случайными элементами, распечатать,
        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        еще один массив).*/

package task15;

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 100));
            System.out.printf("%d   ", mas[i]);
        }

        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%d   ", mas[i]);
        }

        /*Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input length of array");
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            list.add((int)(Math.random() * 100));
        }

        for (int i : list) {
            System.out.printf("%d  ", i);
        }
        Collections.reverse(list);
        System.out.println();
        for (int i : list) {
            System.out.printf("%d  ", i);
        }*/
    }
}
