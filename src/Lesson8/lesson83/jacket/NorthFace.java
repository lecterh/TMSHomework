package jacket;

public class NorthFace implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку The North Face");
    }

    @Override
    public void putOff() {
        System.out.println("Снял куртку The North Face");
    }
}
