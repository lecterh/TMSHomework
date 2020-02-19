/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

package task10;

public class Task10 {
    public static void main(String[] args) {
        int res = 1;
        for (int i = 10; i <= 15; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
