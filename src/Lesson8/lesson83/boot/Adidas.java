package boot;

public class Adidas implements IBoot {
    @Override
    public void putOn() {
        System.out.println("Надел кроссовки Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Снял кросовки Adidas");
    }
}
