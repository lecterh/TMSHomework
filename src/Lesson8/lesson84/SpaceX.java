import java.util.Calendar;
import java.util.GregorianCalendar;

public class SpaceX implements IStart {
    @Override
    public boolean preCheck() {
        Calendar c = new GregorianCalendar();
        long time = c.getTimeInMillis();
        if (time % 3 == 0) {
            System.out.println(time);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Elon, включай зажигание!");
    }

    @Override
    public void start() {
        System.out.println("Полетели!");
    }
}
