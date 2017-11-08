package stedition.threads.javafilosofie;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class MainThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();

        }

        System.out.println("Waiting for LiftOff");
    }
}
