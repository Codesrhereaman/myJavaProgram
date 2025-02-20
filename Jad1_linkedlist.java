/*same as arraylist, the linked list also use to access everything by methods but teh CPU functioning
 is different as the elements are interconnected with previous and next element...
 give some extra elements
 */

import java.util.*;

public class Jad1_linkedlist {
    static void printt(LinkedList<Integer> a1){
//        for (Integer i : a1) {   //full "integer" is written to access for-each loop in linked list
//            System.out.print(i + "\t");
//        }
        System.out.println(a1);
    }
    public static void main(String[] args) {
        //arraylist is collection of dynamic datatypes values holder provides method to deploy
        //by default --> it takes 10 values
        LinkedList<Integer> a1 = new LinkedList<>();
        LinkedList<Integer> a2 = new LinkedList<>();
        //you cannot do function to arraylist but have to use methods for it
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(2);
        a1.add(1);

        //present in linkedList only ,add element at last
        a1.addLast(645);

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
        System.out.print("arraylist modified1: " );
        printt(a1);

        //checking the value
        System.out.println("element is present or not: "+ a1.contains(2)); //is a boolean function

        //indexing of a number
        System.out.printf("index of %d is %d\n",10,a1.indexOf(10));   //-1 if not present
        System.out.printf("index of %d is %d\n",10,a1.lastIndexOf(10));

        //removing
        System.out.println(a1.remove(5));  //return removed value
        System.out.print("arraylist modified2: " );
        printt(a1);

        //removing from last
        a1.removeLast();
        System.out.print("arraylist modified3: " );
        printt(a1);

        //setting
        a1.set(5,2856);
        System.out.print("arraylist modified4: " );
        printt(a1);
        System.out.println(a1);


    }
}
