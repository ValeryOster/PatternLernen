package stedition.threads.javafilosofie;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(service.submit(new TaskWithResult(i)));
        }

        for (Future<String> fs : results ) {

            try{
                System.out.println(fs.get());
            }catch(InterruptedException e){
                e.printStackTrace();
                return;
            }catch(ExecutionException e){
                e.printStackTrace();
            }finally{
                service.shutdown();
            }
        }
    }
}
