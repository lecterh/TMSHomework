package pant;

public class Adidas implements IPant {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Снял штаны Adidas");
    }
}
