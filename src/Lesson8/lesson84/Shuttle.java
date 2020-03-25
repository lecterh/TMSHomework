public class Shuttle implements IStart {
    @Override
    public boolean preCheck() {
        if (((int)(Math.random() * 10)) > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме!");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
