public class ch4_else_if_switch {
    public static void main(String[] args) {
        String var = "aman";
        // use of switch command(remember to use break; after each case)
        switch (var) { //this is advance switch cmd
            case "bh" -> System.out.println("You are legal to have sex");
            /* case "bh": //this is  old switch cmd
             System.out.println("You are legal to have sex");
             break;
             */
            case "aman" -> System.out.println("You are legal to have a child or marry");
            case "pihu" -> System.out.println("i am glad to hear that");
            case "rash" -> System.out.println("your marriage cant proceed");
            default -> System.out.println("no comment on this");
        }
        System.out.println("why do you want to be intimate!!");
        




/*      if to else is called if-elseif-else ladder which once check all and give appropriate result
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>69){
            System.out.print("You are experienced for this job");
        }
        else if(age>45){
            System.out.println("You are good to as a fresher");
        }
        else if(age>25){
            System.out.println("You are only eligible to do internship in our company");
        }
        else{
            System.out.println("There is no requirement in our company for persons like  you");
        }
        */

    }
    }
