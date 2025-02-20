import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Jad1_practice_set {
    public static void main(String[] args) {

        //Q1
//        ArrayList<String> al = new ArrayList<> ();
//        al.add("Aman");
//        al.add("Ashish");
//        al.add("Shorya");
//        al.add("Sakshi");
//        al.add("Ranveer");
//        al.add("Vicky");
//        al.add("Rani");
//        al.add("Aditya");
//        al.add("Nandita Ji");
//        al.add("Satakshi");
//        for(String ele:al ){
//            System.out.print(ele + "\t");
//        }

        //Q2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //Q4
        LocalTime lt = LocalTime.now();
        System.out.println(lt); //direct
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");///using formatter
        System.out.println(lt.format(dtf));

        //Q5
//        HashSet<Integer> hs = new HashSet<>();
//        hs.add(5);
//        hs.add(4);
//        hs.add(3);
//        hs.add(5); //no duplicate element will be created
//        System.out.print(hs + " ");
    }
}
