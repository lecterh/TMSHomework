package Lesson81;

public abstract class Transport {
    private final double KOEF = 0.74;
    private int powerH;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(String model, int maxSpeed, int powerH, int weight) {
        this.powerH = powerH;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public double powerK() {
        return powerH * KOEF;
    }

    public int getPowerH() {
        return powerH;
    }

    public void setPowerH(int powerH) {
        this.powerH = powerH;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return "Model = " + model +
                "\npowerHorses = " + powerH +
                "\nmaxSpeed = " + maxSpeed +
                "\nweight = " + weight;
    }
}
