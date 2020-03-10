/*Напишите три цикла выполняющих многократное сложение строк, один с
        помощью оператора сложения и String, другой с помощью StringBuilder и метода
        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/

package Task21;

import static java.lang.System.nanoTime;

public class Task21 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long strStartTime = nanoTime();
        for (int i = 0; i < 1000; i++) {
            str = str + "tick";
        }
        long strEndTime = nanoTime();

        long strBuildStartTime = nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("tick");
        }
        long strBuildEndTime = nanoTime();

        long strBuffStartTime = nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("tick");
        }
        long strBuffEndTime = nanoTime();

        System.out.println((strEndTime-strStartTime)/1000 + " mks for String");
        System.out.println((strBuildEndTime-strBuildStartTime)/1000 + " mks time for StringBuilder");
        System.out.println((strBuffEndTime-strBuffStartTime)/1000 + " mks time for StringBuffer");
    }
}
