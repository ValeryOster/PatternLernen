package stedition.threads.javafilosofie.DemTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class DaemoFromFactory implements Runnable {
    @Override
    public void run() {
        try{
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool(new DaemoThreadFactory());
        for (int i = 0; i < 10; i++) {
            es.execute(new DaemoFromFactory());
            System.out.println("All daemo started");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
