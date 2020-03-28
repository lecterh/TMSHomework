package Lesson81;

public abstract class LandTransport extends Transport {
    private int wheelsCount;
    private double fuelCons;

    public LandTransport(String model, int maxSpeed, int powerH, int weight,
                         int wheelsCount, double fuelCons) {
        super(model, maxSpeed, powerH, weight);
        this.wheelsCount = wheelsCount;
        this.fuelCons = fuelCons;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(double fuelCons) {
        this.fuelCons = fuelCons;
    }

    public String getDescription() {
        return super.getDescription() +
                "\nWheels count = " + wheelsCount +
                "\nfuel consumption = " + fuelCons;
    }
}
