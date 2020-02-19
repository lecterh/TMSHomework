/*
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день
        он увеличивал дневную норму на 10% нормы предыдущего дня.
        Какой суммарный путь пробежит спортсмен за 7 дней?
*/

package Lesson31;

public class Lesson31 {
    public static void main(String[] args) {
        double result = 0;
        double rangeInDay = 10;
        for (int i = 0; i < 7; i ++) {
            result += rangeInDay;
            rangeInDay *= 1.1;
        }
        System.out.println(result);
    }
}
