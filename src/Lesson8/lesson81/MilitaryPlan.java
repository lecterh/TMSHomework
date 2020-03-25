package Lesson81;

public class MilitaryPlan extends AirTransport {
    private int rocketCount;
    private boolean catapult;

    public MilitaryPlan(String model, int maxSpeed, int powerH, int weight,
                        int wingLength, int minTrackLength, int rocketCount, boolean catapult) {
        super(model, maxSpeed, powerH, weight, wingLength, minTrackLength);
        this.rocketCount = rocketCount;
        this.catapult = catapult;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public void shot() {
        if (rocketCount != 0) {
            rocketCount--;
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapultCan() {
        if (catapult) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public String getDescription() {
        return super.getDescription() +
                "\nrocket count = " + rocketCount +
                "\nIs catapult = " + catapult;
    }
}
