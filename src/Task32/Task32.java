//Имеется текст. Следует составить для него частотный словарь.

package task32;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Task32 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String s = "Lorem Lorem lorem ipsum dolor sit amet, consectetuer adipiscing elit. " +
                "Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque " +
                "penatibus et magnis dis parturient " +
                "montes, nascetur ridiculus mus.";
        String str = s.replaceAll("[.,!?]", "").toLowerCase();

        StringTokenizer tok = new StringTokenizer(str);
        String tmpStr;
        while (tok.hasMoreTokens()) {
            tmpStr = tok.nextToken();
            if (map.containsKey(tmpStr)) {
                map.put(tmpStr, map.get(tmpStr) + 1);
            } else {
                map.put(tmpStr, 1);
            }
        }
        for (Map.Entry<String, Integer> entry :  map.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
