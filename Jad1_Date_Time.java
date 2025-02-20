//time holding is stored from 1jan 1970
//java assumes that year start from 1900
import java.util.*;
public class Jad1_Date_Time {
    public static void main(String[] args) {
//        long l = System.currentTimeMillis();
//        System.out.println("Milliseconds from 1970 are: "+l);
//        System.out.println("seconds from 1970 are: "+ System.currentTimeMillis()/1000f);
//        System.out.println("minutes from 1970 are: "+ System.currentTimeMillis()/60000f);
//        System.out.println("hours from 1970 are: "+ System.currentTimeMillis()/(3600*1000f));
//        System.out.printf("no of years ended from 1970 are: %.3f\n",System.currentTimeMillis()/(3600*1000f*24*365));
//        System.out.println(Long.MAX_VALUE);

        //own date class
        Date d1 = new Date();
        Date d2 = new Date(2005/7/24);
        /*
        Date d3 = new Date(2005,07,24);  --> deprecated method
        d1.getYear().... many methods have been deprecated
        */
        System.out.println(d1);
        System.out.println(d1.after(d2));
        System.out.println(d1.before(d2));
        System.out.println(d1.compareTo(d2));

    }
}
