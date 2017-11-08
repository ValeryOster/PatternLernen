package stedition.Collections.threads;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class mainthreads extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am : " + i);
        }
    }

    public static void main(String[] args) {
        (new mainthreads()).start();
        (new mainthreads()).start();
        (new mainthreads()).start();
        (new mainthreads()).start();
        (new mainthreads()).start();
    }
}
