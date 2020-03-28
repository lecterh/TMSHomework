package Lesson81;

public class Auto extends LandTransport{
    private String bodyType;
    private int passCount;

    public Auto(String model, int maxSpeed, int powerH, int weight, int wheelsCount,
                double fuelCons, String bodyType, int passCount) {
        super(model, maxSpeed, powerH, weight, wheelsCount, fuelCons);
        this.bodyType = bodyType;
        this.passCount = passCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public void tripCalc(int timeMin) {
        double distance = getMaxSpeed() * (timeMin / 60);
        double cons = distance / 100 * getFuelCons();
        System.out.printf("За время %.2f часа, автомобиль %s двигаясь с максимальной скоростью" +
                " %d км/ч израсходует %.2f литров топлива", (double)timeMin/60, getModel(), getMaxSpeed(), cons);
    }

    public String getDescription() {
        return super.getDescription() +
                "\nbody type = " + bodyType +
                "\npassengers count = " + passCount;
    }
}
