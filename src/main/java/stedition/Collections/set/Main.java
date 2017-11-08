package stedition.Collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> number = new TreeSet<>();

        int array[] = new int[]{9,5,3,2,6,8,6,4,3};

        for (int i = 0; i < array.length; i++) {
            number.add(array[i]);
        }

        System.out.println("First element: "+ number.first());
        System.out.println("Last element: "+ number.last());

        SortedSet<Integer> subSet = number.subSet(0, 4);

        System.out.println("Subset first: " + subSet.first());
        System.out.println("Subset last: " + subSet.last());

        System.out.println("Subset with headSet() : " + number.headSet(4));
        System.out.println("Subset with tailSet() : " + number.tailSet(4));
    }
}
