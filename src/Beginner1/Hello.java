/*Изменить данный пример так, что бы при запуске программы ваша программа
        выводила следующее: “Hello, <Ваше имя>!”.*/

package Hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Input your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
