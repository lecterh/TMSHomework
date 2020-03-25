package Lesson81;

public abstract class AirTransport extends Transport {
    private int wingLength;
    private int minTrackLength;

    public AirTransport(String model, int maxSpeed, int powerH, int weight,
                        int wingLength, int minTrackLength) {
        super(model, maxSpeed, powerH, weight);
        this.wingLength = wingLength;
        this.minTrackLength = minTrackLength;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public int getMinTrackLength() {
        return minTrackLength;
    }

    public void setMinTrackLength(int minTrackLength) {
        this.minTrackLength = minTrackLength;
    }

    public String getStringDescription() {
        return super.getDescription() +
                "\nWing Length  = " + wingLength +
                "\nmin track length = " + minTrackLength;
    }
}
