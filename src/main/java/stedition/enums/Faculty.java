package stedition.enums;

/**
 * Example from Book "Java ist auch ein Insel" -- 9.3
 *
 * @author Valery Oster
 * @version 1.0
 */
public enum Faculty {

    EURO(){
        @Override double convertTo(Faculty targetCur, double value) {
            return targetCur == EURO ? value : value / 2;
        }
    },
    PONRODOLLAR(){
        @Override
        double convertTo(Faculty targetCur, double value) {
            return targetCur == PONRODOLLAR ? value : value * 2;
        }
    };
    abstract double convertTo(Faculty targetCur, double value);
}
