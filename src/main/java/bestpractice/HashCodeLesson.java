package bestpractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class HashCodeLesson {
    int i;

    public static void main(String[] args) {
        Map<HashCodeLesson, String> map = new HashMap<>();
        map.put(new HashCodeLesson(), "one");
        System.out.println(map.get(new HashCodeLesson()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCodeLesson that = (HashCodeLesson) o;

        return i == that.i;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + i;
        return result;
    }
}
