/*Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/

package Lesson37;

public class Lesson37 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 99; i += 2) {
            sum += i;
        }

        /*for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }*/
        System.out.printf("%d", sum);
    }
}
