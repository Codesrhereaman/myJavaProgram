import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Jad1_final_date_time_api {
    public static void main(String[] args) {
        //previous class either calendar or date class are mutable . hence using this
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
