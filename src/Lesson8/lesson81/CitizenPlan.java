package Lesson81;

public class CitizenPlan extends AirTransport {
    private int passCount;
    private boolean business;

    public CitizenPlan(String model, int maxSpeed, int powerH, int weight, int wingLength,
                       int minTrackLength, int passCount, boolean business) {
        super(model, maxSpeed, powerH, weight, wingLength, minTrackLength);
        this.passCount = passCount;
        this.business = business;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public void canSit(int count) {
        if (passCount >= count) {
            System.out.println("Все пассажиры на борту");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public String getDescription() {
        return super.getDescription() +
                "\npassenger count = " + passCount +
                "\nIs business = " + business;
    }
}
