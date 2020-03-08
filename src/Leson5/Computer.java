/*
Поля:
        - процессор
        - оперативка
        - жесткий диск
        - ресурс полных циклов работы (включений/выключений)

        Методы:
        - метод описание(вывод всех полей)
        - метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
          вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.Если комп сгорел, при
          попытке включить нужно выдать сообщение что ему конец
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает
*/


package Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private Scanner sc = new Scanner(System.in);

    private static int count = 3;

    private double cpu;
    private int ram;
    private int hdd;
    private boolean isSwicth;

    public boolean getState() {
        if (isSwicth) {
            return true;
        }
        else {
            return false;
        }
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void showInfo() {
        System.out.println("In this computer " +
                "CPU = " + getCpu() +
                ", RAM = " + getRam() +
                ", HDD = " + getHdd() +
                " count switch = " + count);
    }

    public boolean switchOn() {
        System.out.println("Before switch on you must wish dig 0 or 1");
        int random = sc.nextInt();
        Random rand = new Random();
        if (rand.nextInt(2) == random) {
            isSwicth = true;
            return true;
        }
        else {
            System.out.println("You wrong!");
            isSwicth = false;
            return false;
        }
    }

    public boolean switchOff () {
        if (--count == 0) {
            System.out.println("This is your last work on PC. PC is die!");
            isSwicth = false;
            return false;
        } else {
            Random rand = new Random();
            System.out.println("Before switch off you must wish dig 0 or 1");
            int random = sc.nextInt();
            if (rand.nextInt(2) == random) {
                isSwicth = false;
                return true;
            } else {
                System.out.println("You wrong!");
                isSwicth = false;
                return false;
            }
        }
    }

    public Computer() {
        System.out.println("Input your CPU");
        cpu = sc.nextDouble();
        System.out.println("Input your RAM");
        ram = sc.nextInt();
        System.out.println("Input your HDD");
        hdd = sc.nextInt();

    }
}
