package boot;

public class Converse implements IBoot {
    @Override
    public void putOn() {
        System.out.println("Надел кроссовки Converse");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кросовки Converse");
    }
}
