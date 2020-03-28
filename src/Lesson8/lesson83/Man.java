import boot.IBoot;
import jacket.IJacket;
import pant.IPant;

public class Man implements IMan {
    private IPant pant;
    private IJacket jacket;
    private IBoot boot;
    private String name;

    public IPant getPant() {
        return pant;
    }

    public void setPant(IPant pant) {
        this.pant = pant;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IBoot getBoot() {
        return boot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoot(IBoot boot) {
        this.boot = boot;
    }

    public Man(String name, IPant pant, IJacket jacket, IBoot boot) {
        this.name = name;
        this.pant = pant;
        this.jacket = jacket;
        this.boot = boot;
    }

    public Man() {
    }

    @Override
    public void putOnClothes() {
        System.out.println(name);
        pant.putOn();
        jacket.putOn();
        boot.putOn();
    }

    @Override
    public void putOffClothes() {
        System.out.println(name);
        pant.putOff();
        jacket.putOff();
        boot.putOff();
    }
}
