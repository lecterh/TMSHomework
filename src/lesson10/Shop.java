package Lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Shop {
    private List<Item> itemsList = new ArrayList<>();

    public Shop(Item item) {
        addItem(item);
    }

    public Shop() {
    }

    public void addItem(Item item) {
        itemsList.add(item);
    }

    public void showItems() {
        for (Item it : itemsList) {
            System.out.println(it.toString());
        }
    }

    public void removeItem(int id) {
        Iterator iterator = itemsList.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            if (item.getId() == id) {
                iterator.remove();
            }
        }
    }

    public void updateItem(int id, String name, int price) {
        for (Item item : itemsList) {
            if (item.getId() == id) {
                item.setName(name);
                item.setPrice(price);
            }
        }
    }

    public void sortByPrice() {
        itemsList.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    public void sortById() {
        itemsList.sort((o1, o2) -> o2.getId() - o1.getId());
    }
}
