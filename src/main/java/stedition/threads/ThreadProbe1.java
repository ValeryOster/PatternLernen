package stedition.threads;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class ThreadProbe1 extends Thread{
    public static void main(String[] args) {
        new ThreadProbe1().start();
        new ThreadProbe1().start();
        new ThreadProbe1().start();
        new ThreadProbe1().start();
    }

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
