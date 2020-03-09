/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
        записаных по правилам Java, с помощью регулярных выражений и вывести их на
        страницу.*/

package Task22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {
        String strInput = "sdvs0x45 60cASDAF0xABCDE FAa12376hgb0xAABFHYT";
        Pattern pattern = Pattern.compile("0x[0-9A-F]+");
        Matcher matcher = pattern.matcher(strInput);

        while (matcher.find()) {
            for (int i = matcher.start(); i < matcher.end(); i++) {
                System.out.print(strInput.charAt(i));
            }
            System.out.println();
        }
    }
}
