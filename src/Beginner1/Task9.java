/*Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        произведение, т.е. факториал числа.*/

package task9;

public class Task9 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 20);
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.printf("%d! = %d", num, fact);
    }
}
