package CodeWar;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class SmallerDigit {
    public long nextSmaller(long n) {

        String[] str = Long.toString(n).split("");
        int[] longs = new int[str.length];
        int i = 0;
        for (String  z : str) {
            longs[i++] = Integer.parseInt(z);
        }

        for (int j = longs.length-1 ; j > 0 ; j-- ) {

            for (int k = longs.length -(longs.length-j);k>=0;k--)
                if (longs[j] < longs[k] && longs[k] != 0 && longs[j] != 0) {
                    int y = longs[j];
                    longs[j] = longs[k];
                    longs[k] = y;
                    break;
                }
        }

        StringBuilder sb = new StringBuilder();
        for (int a : longs) {
          sb.append(a);

        }
        long result = Long.parseLong(sb.toString());

        if (result >= n)
            return -1;

        return result;
    }

    public SmallerDigit() {
        System.out.println(nextSmaller(21));
        System.out.println(nextSmaller(907));
        System.out.println(nextSmaller(531));
        System.out.println(nextSmaller(1027));
    }

    public static void main(String[] args) {
        new SmallerDigit();
    }
}
