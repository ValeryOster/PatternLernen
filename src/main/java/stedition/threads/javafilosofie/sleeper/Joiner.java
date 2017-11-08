package stedition.threads.javafilosofie.sleeper;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    public void run() {
        try{
            sleeper.join();
        }catch(Exception e){
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " join completed");
    }
}
