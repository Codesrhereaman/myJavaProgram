import java.util.*;
//java calender class is an abstract class
public class Jad1_Calender_class {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance(); //create an object for the calendar class
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        //if we want a particular timezone
        //we can pass any id for country
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeInMillis());
    }
}
