/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
        оценками. Удалить неудовлетворительные оценки из списка.*/

package Task29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task29 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int)(Math.random() * 10));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i < 4) {
                iterator.remove();
            }
        }
    }
}
