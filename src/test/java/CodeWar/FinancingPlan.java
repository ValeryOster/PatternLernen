package CodeWar;

import java.math.BigInteger;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class FinancingPlan {
    public FinancingPlan(int n) {
        finance(n);
    }

    private void finance(int n) {
        int tag = 1, tagZahl = 0;
         BigInteger result = BigInteger.ZERO;
        for (int i = 0; i <= n; i++) {
            tagZahl = i;
            for (int j = 0; j < tag; j++) {
                result = result.add(BigInteger.valueOf(tagZahl));
                tagZahl++;
            }
             tag++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new FinancingPlan(15);
    }
}
