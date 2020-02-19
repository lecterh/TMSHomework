/*Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.*/

package task16;

import java.util.*;

public class Task16 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int indxMin = 0;
        int indxMax = 0;
        int from, to;
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 100));
            System.out.printf("%d   ", mas[i]);
        }

        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                indxMax = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                indxMin = i;
            }
        }

        from = indxMin;
        to = indxMax;

        if (indxMin > indxMax) {
            from = indxMax;
            to = indxMin;
        }
        for (int i = from + 1; i < to; i++) {
            sum += mas[i];
        }
        System.out.printf("\n Min = %d, Max = %d , Summ  = %d", min, max, sum);
    }
}
