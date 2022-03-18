import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
    public Dates() {
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        Calendar calendar = new GregorianCalendar(2022, 2, 17);
        System.out.println(calendar.getTime());
        calendar.add(11, 1);
        System.out.println(calendar.getTime());
    }
}