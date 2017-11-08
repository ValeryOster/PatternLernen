package stedition.generics;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
//
//        Player michael = new Player();
//        michael.name = "Michael Arnold";
//        Pocket pocket = new Pocket();
//        Long aBigNumber = 111_111_111L;
//        pocket.setValue(aBigNumber);
//        michael.lPocket = pocket;
//        michael.rPocket = new Pocket(222_222_222L);
//
//        System.out.println(michael.name + " hat in den Taschen " + michael.lPocket.getValue() +
//                " und " + michael.rPocket.getValue());
//
//        Long val1 = (Long) michael.lPocket.getValue();
//        Long val2 = (Long) michael.rPocket.getValue();
//
//        System.out.println(val1.compareTo(val2) > 0 ? "Links":"Rechts");

        System.out.println("Hallo".getClass().getAnnotations().getClass().getName());
    }
}
