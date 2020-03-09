/*Создать класс и объекты описывающие промежуток времени. Сам промежуток
        в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        Сделать методы для получения полного количества секунд в объекте, сравнения
        двух объектов (метод должен работать аналогично compareTo в строках). Создать
        два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        по отдельности. Сделать метод для вывода данных.*/

package Task24;

public class Task24 {
    public static void main(String[] args) {
        TimeClass t1 = new TimeClass(14, 30, 1);
        TimeClass t2 = new TimeClass(15, 30, 1);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.compareTo(t2));
    }
}
