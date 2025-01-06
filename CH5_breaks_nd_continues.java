public class CH5_breaks_nd_continues {
    public static void main(String[] args){
        //breaks in loops
//        for(int i = 0; i<5; i++){
//            System.out.println(i);
//            System.out.println("i love to do coding");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;   //this will break if cmd and also break the loop and also use same in while or do while loop
//            }
//        }



//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("i love to do coding");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;   //this will break if cmd and also break the loop and also use same in while or do while loop
//            }
//            i++;
//        }while(i<5);





        //continue in loop---------means just run cmd till continue at a point and continue loop
//        for(int i = 0; i<11; i++){
//            if(i==2){  //means when i=2 ignore the code below continue and run the next argument
//                System.out.println("ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("i love to do coding");
//
//        }



        int i = -1;
        do{
            i++;
            if(i==2){
                System.out.println("skipping to next argument" );
                continue;   //this will break if cmd and also break the loop and also use same in while or do while loop
            }
            System.out.println(i);
            System.out.println("i love to do coding");
        }while(i<5);
    }
}
