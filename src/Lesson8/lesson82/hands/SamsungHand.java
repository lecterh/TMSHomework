package by.teachmeskills.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
        System.out.println();
    }

    @Override
    public void upHand() {
        System.out.println("Поднимает руки Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
