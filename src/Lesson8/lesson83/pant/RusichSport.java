package pant;

public class RusichSport implements IPant {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Rusich Sport");
    }

    @Override
    public void putOff() {
        System.out.println("Снял штаны Rusich Sport");
    }
}
