package CodeWar;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class FibonacciZahl {

    public FibonacciZahl() {
        System.out.println(zahl(BigInteger.valueOf(5)));

    }

    public BigInteger zahl(BigInteger n) {
        LinkedHashMap<Integer, BigInteger> list = new LinkedHashMap<>();
        BigInteger x = BigInteger.ONE, y = BigInteger.ONE, result = BigInteger.ZERO;
        int z = 1;
        list.put(0, x);
        list.put(1, y);


        while (n.compareTo(BigInteger.valueOf(z)) != 0){
            if (x.compareTo(y) <= 0) {
                x = x.add(y);
            } else {
                y = y.add(x);
            }

            z++;
            list.put(z, x.compareTo(y) > 0 ? x : y );
        }

        for (Map.Entry<Integer, BigInteger> a : list.entrySet()) {
            result = result.add( a.getValue() );
        }

        return result.multiply(BigInteger.valueOf(4));
    }

    public static void main(String[] args) {
        new FibonacciZahl();
    }
}
