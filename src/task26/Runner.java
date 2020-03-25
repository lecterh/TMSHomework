/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
        объектов описанных классов, часть из них включить в розетку.
        Иерархия должна иметь хотя бы три уровня.*/

package Task26;

public class Runner {
    public static void main(String[] args) {
        TVSony sony = new TVSony(5,43, SocketType.EURO, "SmartTV");
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", true, SocketType.EURO);
        vacuumCleaner.switchOn(true);
        sony.switchOn(true);
        System.out.println(sony.toString());
        System.out.println(vacuumCleaner.toString());
    }
}
