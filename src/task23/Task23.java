/*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
        которых есть параметры, например <p id=”p1 ”>, и замену их на простые теги
        абзацев <p>.*/

package Task23;

public class Task23 {
    public static void main(String[] args) {
        String strInput = "<p id=”p1”> этот текст менять не надо а этот - </p> надо";
        System.out.println(strInput.replaceAll("<.+?>", "<p>"));
    }
}
