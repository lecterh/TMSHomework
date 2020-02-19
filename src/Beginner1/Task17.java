/*Создать двухмерный квадратный массив, и заполнить его «бабочкой»*/

package task17;

public class Task17 {
    public static void main(String[] args) {
        int[][] mas = new int[7][7];

        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas[i].length - i; j++) {
                mas[i][j] = 1;
            }
        }
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = i; j >= mas[i].length - i - 1; j--) {
                mas[i][j] = 1;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%d  ", mas[i][j]);
            }
            System.out.println();
        }
    }
}
