package stedition.hash;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class Player {
    public String name;
    int age;
    int weight;


    @Override
    public int hashCode() {
        int resutl = 31 + age;
        resutl = 31 * resutl + ((name == null) ? 0 : name.hashCode());
        long temp = Double.doubleToLongBits(weight);
        resutl = 31 * resutl + (int) (temp ^ (temp >>> 32));

        return resutl;
    }
}
