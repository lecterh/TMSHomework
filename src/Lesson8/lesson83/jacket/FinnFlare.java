package jacket;

public class FinnFlare implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Finn Flare");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку Finn Flare");
    }
}
