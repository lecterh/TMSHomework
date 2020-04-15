package Lesson10;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Beer", 4);
        Shop shop = new Shop(item);
        shop.addItem(new Item("Apple", 7));
        shop.addItem(new Item("Lemon", 3));
        shop.addItem(new Item("Coca-Cola, 1L", 2));
        shop.addItem(new Item("Rom Captain Morgan Gold", 12));

        shop.showItems();
        shop.sortById();
        shop.showItems();
        shop.removeItem(10001);
        shop.updateItem(10002, "Лимон", 24);
        shop.showItems();
    }
}
