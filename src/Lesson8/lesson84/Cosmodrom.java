import java.util.concurrent.TimeUnit;

public class Cosmodrom {

    public void launch(IStart start) throws InterruptedException {
        if (!start.preCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(500);
            }
            start.start();
        }
    }
}
