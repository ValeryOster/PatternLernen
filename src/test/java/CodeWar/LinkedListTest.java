package CodeWar;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(34);
        list.add(78);

        int a = list.size()/2;

        String agc = "hallo du";
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = agc.split(" ");

        for (int x = array.length-1; x >= 0; x--) {
            stringBuilder.append(array[x]).append(" ");
        }

        System.out.println(stringBuilder.toString());
    }
}
