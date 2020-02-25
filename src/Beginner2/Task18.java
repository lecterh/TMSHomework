/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
        общее их количество.*/

package Task18;

public class Task18 {
    public static void main(String[] args) {
        String strInput = "In some, card games, the - Joker. is a wildcard? and can represent! any card in the deck.";
        int one = strInput.length();    //Длина строки со знаками препинания
        int two = (strInput.replaceAll("[,.?!-]","").length()); //Длина строки без знаков препинания

        System.out.println(one-two);
    }
}
