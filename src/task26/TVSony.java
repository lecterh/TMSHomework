package Task26;

public class TVSony extends TV {
    private String oc;

    public TVSony(int volume, int chanel, SocketType socketType, String oc) {
        super(volume, chanel, socketType, "Sony");
        this.oc = oc;
    }

    @Override
    public String toString() {
        return super.toString() + " and OC " + oc;
    }
}
