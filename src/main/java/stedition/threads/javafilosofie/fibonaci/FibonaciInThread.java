package stedition.threads.javafilosofie.fibonaci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class FibonaciInThread {
    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<BigInteger>> results = new ArrayList<>();
        BigInteger resNumber = BigInteger.ZERO;

        for (int i = 0; i < 7; i++) {
            results.add(service.submit(new FibonaciZahl(25)));
        }

        for (Future<BigInteger> fs : results) {
            try{
                System.out.println(resNumber + " + " + fs.get() + " = " + (resNumber = resNumber.add(fs.get()) ));
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                service.shutdown();
            }
        }

    }
}
