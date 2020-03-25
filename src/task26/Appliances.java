package Task26;

public abstract class Appliances {
    private boolean state;

    public void switchOn(boolean state) {
        this.state = state;
    }
    public boolean getState() {
        return state;
    }

    public abstract void socketIn(SocketType type);
}
