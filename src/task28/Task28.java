/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
        etc.). Реализовать метод get(int index), который возвращает любой элемент
        массива по индексу.*/

package Task28;

public class Task28 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        MyClass<Integer> myClassInt = new MyClass<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.printf("%d  ", arr[i]);
        }
        System.out.println();
        myClassInt.setEl(arr);
        System.out.println(myClassInt.getEl(3));
    }
}
