package stedition.threads.javafilosofie.DemTest;

import java.util.concurrent.ThreadFactory;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class DaemoThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        System.out.println("Ich bin in newThread");
        return t;
    }
}
