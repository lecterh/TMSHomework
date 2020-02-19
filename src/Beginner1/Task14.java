/*Создать массив оценок произвольной длины, вывести максимальную и
        минимальную оценку, её (их) номера.*/

package task14;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int min;
        int max;
        int posMin;
        int posMax;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((int) (Math.random() * 100));
            System.out.printf("%d  ", mas[i]);
        }
        min = max = mas[0];
        posMin = posMax = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                posMax = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                posMin = i;
            }
        }
        System.out.printf("\nMin оценка = %d позиция %d, Max оценка = %d позиция %d", min, posMin + 1, max, posMax + 1);


        /*ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inout length of array");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            list.add((int)(Math.random() * 10));
            System.out.printf("%d  ", list.get(i));
        }
        System.out.printf("\nMin оценка = %d под номером %d, Max оценка = %d под номером %d", Collections.min(list),
                list.indexOf(Collections.min(list))+1, Collections.max(list), list.indexOf(Collections.max(list))+1);*/
    }
}
