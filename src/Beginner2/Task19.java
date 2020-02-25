/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
        текста также могут быть пробелы, но могут и отсутствовать.*/

package Task19;

import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {

        String strInput = "   Имеется строка с    текстом. Подсчитать количество слов в тексте. Желательно";
        StringTokenizer s = new StringTokenizer(strInput);
        System.out.println(s.countTokens());

    }
}
