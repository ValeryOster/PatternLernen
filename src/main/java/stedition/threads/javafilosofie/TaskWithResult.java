package stedition.threads.javafilosofie;

import java.util.concurrent.Callable;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class TaskWithResult implements Callable<String > {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String  call() throws Exception {
        return "result of TaskWithResult" + id;
    }

}
