/*Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
        Определить существует ли такой треугольник. Дано: a, b, c –стороны
        предполагаемого треугольника. Требуется сравнить длину каждогоотрезка-стороны
        с суммой двух других. Если хотя бы в одном случае отрезококажется больше суммы
        двух других, то треугольника с такими сторонами несуществует.*/

package lesson22;

import java.util.Scanner;

public class Lesson22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side a");
        int a = sc.nextInt();
        System.out.println("Input side b");
        int b = sc.nextInt();
        System.out.println("Input side c");
        int c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a))
            System.out.println("Triangle is real");
        else
            System.out.println("Triangle doesn't real");
    }
}
