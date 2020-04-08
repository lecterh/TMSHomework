/*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
        числа.*/

package Task30;

import java.util.ArrayList;
import java.util.List;

public class Task30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10));
        }

        for (Integer i : list) {
            if (!finalList.contains(i)) {
                finalList.add(i);
            }
        }
    }
}
