package Lesson81;

public class Truck extends LandTransport {
    private int capacity;

    public Truck(String model, int maxSpeed, int powerH, int weight,
                 int wheelsCount, double fuelCons, int capacity) {
        super(model, maxSpeed, powerH, weight, wheelsCount, fuelCons);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void canCapacity(int cargo) {
        if (capacity >= cargo) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public String getDescription() {
        return super.getDescription() +
                "\ncapacity = " + capacity;
    }

}
