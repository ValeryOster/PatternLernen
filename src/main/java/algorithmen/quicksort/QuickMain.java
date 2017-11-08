package algorithmen.quicksort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class QuickMain {
    public QuickMain(int i) {
        List<Integer> list = IntStream.generate(() -> {
            return (int) (Math.random() * 100);
        }).limit(i).boxed().collect(Collectors.toList());

//        for (int y : list) {
//            System.out.print(y+", ");
//        }
        long timeStart = System.currentTimeMillis();
        quickSort(list, 0, list.size()-1);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Quick Sort requires " + (timeEnd-timeStart));

    }

    private void quickSort(List<Integer> list, int p, int r) {
        if (p < r) {
            int q = partition(list, p, r);
//            System.out.println();
//            for (int y : list) {
//                System.out.print(y+", ");
//            }
            quickSort(list, p, q - 1);
            quickSort(list, q + 1, r);
        }

    }

    private int partition(List<Integer> list, int p, int r) {
        int x = list.get(r);
        int i = p - 1;
        int ch;

        for (int j = p; j <= r - 1; j++) {
            if (list.get(j) <= x) {
                i++;
                ch = list.get(i);
                list.set(i, list.get(j));
                list.set(j, ch);
            }
        }
        ch = list.get(i + 1);
        list.set(i + 1, list.get(r));
        list.set(r, ch);

        return i+1;
    }

    public static void main(String[] args) {
        new QuickMain(30);
    }
}
