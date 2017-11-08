package stedition.threads.javafilosofie;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class CachedThreadPool {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 12; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
