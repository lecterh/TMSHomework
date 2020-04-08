package Lesson10;

public class Item {
    private static int count = 10000; //счетчик для ID товара состоит из 5 цифр с префиксом 1
    private String name;
    private int price;
    private int id;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID = " + id + "; name = " + name + "; price = " + price;
    }
}
