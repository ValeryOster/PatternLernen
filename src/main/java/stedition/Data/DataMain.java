package stedition.Data;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Description
 *
 * @author Valery Oster
 * @version 1.0
 */
public class DataMain {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance(new Locale("DE"));
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, Calendar.MINUTE, Calendar.SECOND);
        System.out.println(calendar.getTime());


        MyClass<Integer> myInterMyClass = new MyClass<Integer>();
    }
}

 class MyClass<T extends Number> {

    public void print() {

    }
}
