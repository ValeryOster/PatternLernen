package stedition.threads.javafilosofie.DemTest;

import java.util.concurrent.TimeUnit;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class SempleDemo implements Runnable{

    @Override
    public void run() {
        try{
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread demo = new Thread(new SempleDemo());
            demo.setDaemon(true);
            demo.start();
        }
        System.out.println("All demo started");
        try {
            TimeUnit.MILLISECONDS.sleep(75);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
