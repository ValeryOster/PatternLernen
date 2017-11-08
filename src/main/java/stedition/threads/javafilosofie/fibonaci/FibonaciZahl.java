package stedition.threads.javafilosofie.fibonaci;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class FibonaciZahl implements Callable<BigInteger>{
    BigInteger zahl = BigInteger.ONE;
    Integer grosser;

    public BigInteger berechneFibonci(Integer var) {

        BigInteger z1 = BigInteger.ONE, z2 = BigInteger.ZERO;

        for (int i = 3; i < var; i++) {
            z2 = zahl;
            zahl = zahl.add(z1);
            z1 = z2;
        }

        return zahl;
    }

    @Override
    public BigInteger call() throws Exception {
        return berechneFibonci(grosser);
    }

    public FibonaciZahl(Integer grosser) {
        this.grosser = grosser;
    }
}
