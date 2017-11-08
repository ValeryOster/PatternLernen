package algorithmen.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class MergeMain {
    public MergeMain(int anzahl) {
        List<Integer>list = IntStream.generate(()->{
            return (int) (Math.random() * 100);
        }).limit(anzahl).boxed().collect(Collectors.toList());

//        for (int a : list) {
//            System.out.print(a + ", ");
//        }
//        System.out.println();

        long timeStart = System.currentTimeMillis();
        mergesort(list);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Merge Sort requires " + (timeEnd-timeStart));

    }

    private List<Integer> mergesort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        int half = list.size() / 2;
        List<Integer> lList = list.subList(0, half);
        List<Integer> rListe = list.subList(half, list.size());

        return mergeList(mergesort(lList), mergesort(rListe));
    }

    private List<Integer> mergeList(List<Integer> msLeft, List<Integer> msRight) {

        int resultArraySize = msLeft.size() + msRight.size();
        List<Integer> mainList = new ArrayList<>();

        int fIndex = 0, sIndex = 0;
        for (int i = 0; i < resultArraySize; i++) {
            if(fIndex == msLeft.size()) {
                mainList.add(msRight.get(sIndex++));
            }
            else if (sIndex == msRight.size()) {
                mainList.add(msLeft.get(fIndex++));
            }
            else if (msLeft.get(fIndex) < msRight.get(sIndex)) {
                mainList.add(msLeft.get(fIndex++));
            }else {
                mainList.add(msRight.get(sIndex++));
            }
        }
//        System.out.println();
//        for (int a : mainList) {
//            System.out.print(a + ", ");
//        }

        return mainList;
    }

    public static void main(String[] args) {
        new MergeMain(10);
    }
}
