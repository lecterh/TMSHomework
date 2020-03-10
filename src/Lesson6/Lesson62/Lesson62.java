package Lesson62;

/*Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0*/
public class Lesson62 {
    public static void main(String[] args) {
        String str = "Заменить все вхождения символа стоящего в " +
                "позиции 3 на символ стоящий в позиции 0";
        char start = str.charAt(3);
        char end = str.charAt(0);
        System.out.println(str.replaceAll(String.valueOf(start), String.valueOf(end)));
    }
}
