/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.*/

package Task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int)(Math.random() * 100));
        }

        Iterator iterator = list.iterator();
        int val = Integer.MIN_VALUE;
        int tmp;
        while (iterator.hasNext()) {
            tmp = (int) iterator.next();
            if (val < tmp) {
                val = tmp;
            }
        }
    }
}
