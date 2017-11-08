package stedition.threads.javafilosofie.sleeper;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (Exception e) {
            System.out.println(getName() + " was interrupted. "
            + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}
