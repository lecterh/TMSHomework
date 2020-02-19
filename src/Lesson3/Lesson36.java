/*Напишите программу вывода всех четных чисел от 2 до 100 включительно*/

package Lesson36;

public class Lesson36 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.printf("%d  ", i);
        }

        /*for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.printf("%d  ", i);
        }*/
    }
}
