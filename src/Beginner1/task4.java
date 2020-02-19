/*Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n.*/

package task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input digit");
        StringBuilder b = new StringBuilder(sc.nextLine());
        System.out.println(Integer.parseInt(b.reverse().toString()));
    }
}
