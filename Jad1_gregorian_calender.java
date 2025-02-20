import java.util.Calendar;
import java.util.Scanner;


public class Jad1_gregorian_calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.HOUR)+ ":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
//        System.out.printf("%d/%02d/%02d",c.get(Calendar.YEAR), c.get(Calendar.MONTH),c.get(Calendar.DATE));

        //my own instance(object)
        //calculating my age precisely
        //Calendar d = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your dateofbirth (yyyy/mm/dd) : ");
        String inp = sc.nextLine();
        String[] dmy = inp.split("/");
        int by = Integer.parseInt(dmy[0]);
        int bm = Integer.parseInt(dmy[1])-1;
        int bd = Integer.parseInt(dmy[2]);
        int dy = c.get(Calendar.YEAR)-by;
        int dm = c.get(Calendar.MONTH)-bm;
        int dd = c.get(Calendar.DATE)-bd;
        if(dm<0){
            dy--;
            dm+=12;
            if(dd<0){
                dm--;
                dd+=30;
            }
        }
        System.out.printf("your age is: %02d year %02d months %02d days",dy, dm,dd);
        sc.close();
        //still it is garbage so have to create another class.... that is java date and time api
    }
}
