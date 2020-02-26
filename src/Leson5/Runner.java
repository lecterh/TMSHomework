package Computer;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer  pc = new Computer();
        //Крутимся в бесконечнос цикле пока не 0 - Выход
        //если не угадал цифру при вкл\выкл - выход
        //если закончился счетчик включений - выход
        while (true) {
            System.out.println("What do you want to do?" +
                    "\n1 - show info about PC" +
                    "\n2 - switch On PC" +
                    "\n3 - switch Off PC" +
                    "\n0 - Exit");
            int chose = sc.nextInt();
            switch (chose) {
                case 1: {
                    pc.showInfo();
                    break;
                }
                case 2: {
                    if (pc.getState()) {
                        System.out.println("PC is already On");
                        break;
                    }
                    else {
                        if (pc.switchOn()) {
                            System.out.println("PC switchOn successfully");
                            break;
                        }
                        else {
                            System.out.println("PC is die");
                            System.exit(0);
                        }
                    }
                    break;
                }
                case 3: {
                    if (!pc.getState())  {
                        System.out.println("PC is already Off");
                        break;
                    }
                    else {
                        if (pc.switchOff()) {
                            System.out.println("PC switchOff successfully");
                            break;
                        }
                        else {
                            System.out.println("Computer is die!");
                            System.exit(0);
                        }
                    }
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        }
    }
}
