package boot;

public class Nike implements IBoot {
    @Override
    public void putOn() {
        System.out.println("Надел кроссовки Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кросовки Nike");
    }
}
