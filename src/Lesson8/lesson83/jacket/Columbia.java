package jacket;

public class Columbia implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Columbia");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку Columbia");
    }
}
