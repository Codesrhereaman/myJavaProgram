import java.util.*;

public class Jad1_arraylist {
    static void printt(ArrayList<Integer>a1){
        for (int i =0; i<a1.size(); i++) {
            System.out.print(a1.get(i) + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //arraylist is collection of dynamic dataTypes values holder provides method to deploy
        //by default --> it takes 10 values
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>(8);
        //you cannot do function to arraylist but have to use methods for it
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(2);
        a1.add(1);

        //specific index value
        a1.add(1,9);

        //adding a full list
        a2.add(10);
        a2.add(11);
        a2.add(12);
        a1.addAll(a2);
        System.out.print("original arraylist: " );
        printt(a1);

        //adding from specific index
        a1.addAll(0,a2);
        System.out.print(" arraylist modified1: " );
        printt(a1);

        //checking the value
        System.out.println("element is present or not"+ a1.contains(2)); //is a boolean function

        //indexing of a number
        System.out.printf("index of %d is %d",10,a1.indexOf(10));   //-1 if not present
        System.out.printf("index of %d is %d",10,a1.lastIndexOf(10));

        //removing
        System.out.println(a1.remove(0));  //return removed value
        System.out.print(" arraylist modified2: " );
        printt(a1);

        //setting
        a1.set(5,2856);
        System.out.print(" arraylist modified3: " );
        printt(a1);


    }
}
