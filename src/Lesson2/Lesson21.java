        /*В переменную записываем число. Надо вывести на экран сколько в этомчисле
        цифр и положительное оно или отрицательное. Например,
        "этооднозначное положительное число". Достаточно будет определить,
        является личисло однозначным, "двухзначным или трехзначным и более.*/


package lesson21;

import java.util.Scanner;

public class Lesson21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.println("Input number");
        num = sc.nextInt();

        if (num > 0)
            System.out.println("Number is positive");
        else if (num < 0)
            System.out.println("Number is negative");
        else {
            count = 1;
            System.out.println("Number = 0");
        }

        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.printf("In number %d digit", count);
    }
}
