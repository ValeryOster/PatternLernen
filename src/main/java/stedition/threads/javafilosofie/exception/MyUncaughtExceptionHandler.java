package stedition.threads.javafilosofie.exception;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("MyUncaughtExceptionHandler cought it !!!");
    }
}
