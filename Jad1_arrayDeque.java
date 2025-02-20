/*
same as linked list can use multiple elements... it helps to store and remove values
from last and first as specified
 */

import java.util.ArrayDeque;

public class Jad1_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> s1 = new ArrayDeque<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.addLast("z");
        System.out.println("original"+s1);
        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());
        System.out.println(s1.removeFirst());
        System.out.println(s1.removeLast());
        System.out.println("modified 1" + s1);
        s1.clear();
        System.out.println("modified 1" + s1);


    }
}
