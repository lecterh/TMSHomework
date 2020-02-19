/*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
        Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

package Lesson32;

public class Lesson32 {
    public static void main(String[] args) {
        int count = 1;
        int result = count;

        for (int i = 0; i < 24; i += 3) {
            count *= 2;
            result += count;
            count = result;
        }
        System.out.printf("Через 24 часа будет %d амеб", result);
    }
}
