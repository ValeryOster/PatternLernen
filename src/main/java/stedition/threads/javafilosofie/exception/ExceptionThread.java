package stedition.threads.javafilosofie.exception;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
