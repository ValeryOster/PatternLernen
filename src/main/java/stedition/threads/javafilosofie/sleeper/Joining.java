package stedition.threads.javafilosofie.sleeper;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper
                sleeper = new Sleeper("Sleepy", 1500),
                grumpy = new Sleeper("Grumpy", 1500);
        Joiner
                dopey = new Joiner("Dopey", sleeper),
                doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();
    }
}
