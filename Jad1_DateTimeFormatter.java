import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Jad1_DateTimeFormatter {
    public static void main(String[] args) {
        //date time format is the best way also to  get anything in required format
        LocalDateTime dt = LocalDateTime.now();//here is the date
        System.out.println(dt);

        //there are some keywords that we can use to define hour/sec/min/year/day......
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m:s a");//here is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;//can use default formatter

        String mydate = dt.format(df);
        String mydate2 = dt.format(df2);
        System.out.println(mydate);
        System.out.println(mydate2);
    }
}
