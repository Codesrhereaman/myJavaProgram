public class ch6_arrays {
    public static void main(String[] args) {
        /*storing of 500 students of a class--- u are going to store marks
        1.create 500 varibales
        2.use arrays(recommended)
         */
     //array is a collection of similar types of data and size varies from 0 to(n-1)
     //1. int[]marks = new int[5];  //-means declaration and memory allocation
     //2. declaration and then memory allocation
//        int []marks;
//        marks = new int[5]; //
//        marks[0] = 79;
//        marks[1] = 67;
//        marks[2] = 92;
//        marks[3] = 85;
//        marks[4] = 69;
//        marks[4] = 96;  //this is an update for the value of value or marks[4]
        //marks[5] = 89;  this will throw error as it is out of the range
        //3. declaration and intialise and memory allocation done acco to the objects by java itself
        int [] marks = {79,67,92,85,69};
        System.out.println(marks[4]);
        marks[4] = 96;
    }
}
