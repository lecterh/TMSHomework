/*Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
        для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

package Lesson35;

public class Lesson35 {
    public static void main(String[] args) {
        double[][] mas = new double[21][21];
        for (int i = 0; i < mas.length - 1; i++) {
            mas[i][i] = i + 1;
            mas[i][i + 1] = (i + 1) * 2.54;
            System.out.printf("%2.2f inch = %2.2f cm", mas[i][i], mas[i][i + 1]);
            System.out.println();
        }
    }
}
