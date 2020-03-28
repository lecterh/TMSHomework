package Task26;

public class VacuumCleaner extends Appliances {
    private boolean washingCleaner;
    private SocketType socketType;
    private String model;

    public VacuumCleaner(String model, boolean washingCleaner, SocketType socketType) {
        this.model = model;
        this.washingCleaner = washingCleaner;
        this.socketType = socketType;
    }

    @Override
    public void socketIn(SocketType type) {
        System.out.println("Your Vacuum cleaner plugIn with " + socketType.toString() + " socket type");
    }

    @Override
    public String toString(){
        if (washingCleaner) {
            return "Your vacuum cleaner " + model + ", with socket " +
                    socketType.toString() + " can washing clean";
        }
        else {
            return "Your vacuum cleaner " + model + ", with socket " +
                    socketType.toString() + " can't washing clean";
        }
    }
}
