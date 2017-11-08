package stedition.enums;

import static stedition.enums.Faculty.EURO;
import static stedition.enums.Faculty.PONRODOLLAR;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(EURO.convertTo(EURO, 10));
        System.out.println(EURO.convertTo(PONRODOLLAR, 10));
        System.out.println(PONRODOLLAR.convertTo(PONRODOLLAR, 10));
        System.out.println(PONRODOLLAR.convertTo(EURO, 10));
    }
}
