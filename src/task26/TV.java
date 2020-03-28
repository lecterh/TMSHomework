package Task26;

public class TV extends Appliances {
    private int chanel;
    private int volume;
    private SocketType socketType;
    private String model;

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public TV(int volume, int chanel, SocketType socketType, String model) {
        this.volume = volume;
        this.chanel = chanel;
        this.socketType = socketType;
        this.model = model;
    }

    @Override
    public void socketIn(SocketType socketType) {
        System.out.println("Your TV plugIn with " + socketType.toString() + " socket type");
    }

    @Override
    public String toString() {
        return "Your TV " + model + " , support " + socketType + " socket";
    }
}
