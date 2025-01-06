public class ch6_for_each_loop {
    public static void main(String[] args) {
       // int [] marks = {79,67,92,85,69};
        float [] marks = {79.5f,67.50f,92,85,69};
        String [] students = {"Aman","Kartik","ankit","harry"};
//        System.out.println(students.length);  //for finding length use reference.length
//          displaying a whole array
        System.out.println("causal method to display");
        System.out.println(marks[0]); ///temporary and a moron method
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //correct way to display using for loop
      System.out.println("printing using loop method");
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + "\t");
        }


        //quick quiz -- print array inn reverse order
        System.out.println("printing in reverse order");
        for(int i=marks.length-1; i>=0; i--){
            System.out.print(marks[i]+"\t");
        }


        //best way to display an array using for-each loop
      System.out.println("printing using for-each loop method");
        for(String element: students){
            System.out.print(element+"\t");
        }









    }
}
