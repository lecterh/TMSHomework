/*Имеется строка с текстом. Вывести текст, составленный из последних букв
        всех слов.*/

package Task20;

import java.util.StringTokenizer;

public class Task20 {
    public static void main(String[] args) {
        String strInput = "Имеется     строка с текстом. Вывести текст, составленный из последних букв\n" +
                "        всех слов.";
        int i = 0;
        //Убираем из строки знаки препинания, чтобы состаавить слово именно из букв
        StringTokenizer stringTokenizer = new StringTokenizer(strInput.replaceAll("[.,!?-]", ""));
        String[] arr = new String[stringTokenizer.countTokens()]; //Размер массива = кол-ву слов (раздееленных пробелом)
        while (stringTokenizer.hasMoreTokens()) {
            arr[i] = stringTokenizer.nextToken();
            i++;
        }
        for (String s : arr) {
            System.out.print(s.toCharArray()[s.length()-1]);
        }
    }
}
