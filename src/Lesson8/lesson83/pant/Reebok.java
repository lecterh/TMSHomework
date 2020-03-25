package pant;

public class Reebok implements IPant {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Reebok");
    }

    @Override
    public void putOff() {
        System.out.println("Снял штаны Reebok");
    }
}
