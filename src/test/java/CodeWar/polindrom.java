package CodeWar;

import java.util.SortedSet;
import java.util.TreeSet;

public class polindrom {
    public static void main(String[] args) {

        SortedSet<Integer> nuberSet = new TreeSet<Integer>();

        int[] array = new int[]{9, 1, 7, 6, 2, 0, 3, 8, 5, 4};

        for (int i = 0; i < array.length; i++) {
            nuberSet.add(array[i]);
        }
        System.out.println("First element: " + nuberSet.first());
        System.out.println("Last element: " + nuberSet.last());
    }
}
