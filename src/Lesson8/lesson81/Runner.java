package Lesson81;

public class Runner {
    public static void main(String[] args) {
        Auto a1 = new Auto("Mercedes", 260, 150, 2120, 4,
                5.6, "Coupe", 5);
        a1.tripCalc(135);
        System.out.println();
        System.out.println(a1.getDescription());
    }
}
