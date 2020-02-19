/*Вычислить: 1+2+4+8+...+256*/

package Lesson33;

public class Lesson33 {
    public static void main(String[] args) {
        int n = 0; // количество членов в прогрессии

        for (int i = 1; i <= 256; i *= 2) {
            n++;
        }
        // по формуле sum = (b1 * q ^ n - 1) / (q - 1) вычисляем сумму элементов
        int sum = (int) (1 * (Math.pow(2, n)) - 1) / (2 - 1);
        System.out.println(sum);
    }
}
