import java.util.Scanner;

public class ch4_practice_set {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);


        //Q1
//        int a = 10;
//        if(a = 11){ //will give us error as = is used to assign values not checking values
//            System.out.println("i am 11");
//        }
//        else {
//            System.out.println("i am not 11");
//        }

            //Q2

//        System.out.println("enter physics marks: ");
//        float a = scc.nextFloat();
//        System.out.println("enter maths marks: ");
//        float b = scc.nextFloat();
//        System.out.println("enter chem marks: ");
//        float c = scc.nextFloat();
//        System.out.println("enter one sub total marks");
//        float d = scc.nextFloat();
//        float e = a*100f/d;
//        float f = b*100f/d;
//        float g = c*100f/d;
//        float h = (a+b+c);
//        float i = (h*100f)/d*3f;
//        if(e>33 && f>33 && g>33 && i>40){
//            System.out.println("Congrats \n\t You have passed the exam");
//        }
//        else{
//            System.out.println("sorry \n\t You unfortunately failed in the exam");
//        }

        //when doing continuous cal. in one argument use that term continuously like here is tax

        //Q3


        double tax ;//
        int lp = 1;
        while(lp<=5) {
            System.out.println("Enter your annual income(in lakhs): ");
            double inc = scc.nextFloat();
            lp++;
            if (inc >= 3 && inc <= 6) {
                System.out.println("your additional tax is 5%");
                tax = (inc - 3) * 5 / 100;
                System.out.printf("You have to pay total amount of tax is: %.2f \n", tax);
            }
            else if (inc <= 9 && inc > 6) {
                System.out.println("your additional tax is 10%");
                tax = 3 * 5 / 100f;
                tax = tax + (inc - 6) * 10 / 100;
                System.out.printf("You have to pay total amount of tax is: %.3f \n", tax);
            }
            else if (inc > 9 && inc <= 12) {
                System.out.println("your additional tax is 15%");
                tax = (3) * 5 / 100f ;
                tax = tax + (float) 3 * 10 / 100;
                tax = tax + (inc - 9) * 15 / 100;
                System.out.printf("You have to pay total amount of tax is: %.3f \n", tax);
            }
            else if (inc > 12 && inc <= 15) {
                System.out.println("your additional tax is 20%");
                tax = 3 * 5 / 100f;
                tax = tax + (float) 3 * 10 / 100;
                tax = tax + (float) 3 * 15 / 100;
                tax = tax + (inc - 12) * 20 / 100;
                System.out.printf("you have to pay a total amount of tax is: %.3f \n", tax);
            }
            else if (inc > 15) {
                tax = 3 * 5 / 100f;
                tax = tax + (float) 3 * 10 / 100;
                tax = tax + (float) 3 * 15 / 100;
                tax = tax + (float) 3 * 20 / 100;
                tax = tax + (inc - 15) * 30 / 100;
                System.out.printf("you have to pay a total amount of tax is: %.3f \n", tax);
            }
            else {
                System.out.println("Yor are tax exempt");
            }
        }
        //if you want to print tax at here use "tax=0" at start


//        //Q4
//        System.out.println("Enter your number");
//        int day = scc.nextInt();
//        switch(day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//        }
//
//
//        //Q5
//        System.out.println("Enter your year");
//        int year = scc.nextInt();
//        int no = 4;
//        if(year%no==0){
//            System.out.println("Entered year is a leap year");
//        }
//        else{
//            System.out.println("Entered year is not a leap year");
//        }
//
//
//
//        //Q6
//        System.out.println("Enter your site link");
//        String site = scc.nextLine();
//        if(site.endsWith(".com")){
//            System.out.println("this is a company website");
//        }
//        else if(site.endsWith(".in")){
//            System.out.println("this is an indian website");
//        }
//        else if(site.endsWith(".org")){
//            System.out.println("this is an organizational website");
//        }
//        else{
//            System.out.println("this is not an authentic web");
//        }


    }
}
