/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
   полностью закрыть круглой картонкой радиусом r.*/

package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double sideA;
        double sideB;
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side sideA");
        sideA = sc.nextDouble();
        System.out.println("Input side sideB");
        sideB = sc.nextDouble();
        System.out.println("Input radius radius");
        radius = sc.nextDouble();

        System.out.print("Cover? ");
        System.out.println((Math.pow(sideA, 2) + Math.pow(sideB, 2)) >= Math.pow(2*radius, 2));
    }
}
