import java.util.*;
//load factor has linked hash set that is used for extending the capacity
public class Jad1_hash_set {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(5,0.35f);
        ArrayList<Integer> a1 = new ArrayList<>();
        LinkedList<Integer> l1 = new LinkedList<>();
        ArrayDeque<Integer> a2 = new ArrayDeque<>();
        a1.add(1);
        a1.add(2);
        System.out.println("arraylist : " + a1);
        l1.add(3);
        l1.add(4);
        System.out.println("linkedlist : " + l1);
        h1.add(5);
        h1.add(6);
        System.out.println("hashset : " + h1);
        a2.add(7);
        a2.add(8);
        System.out.println("arraydeque : " + a2);
        h1.addAll(a1);
        h1.addAll(l1);
        h1.addAll(a2);
        System.out.println("hashset after adding all in one : " + h1);
        System.out.println(h1.spliterator());
        System.out.println("hashset after adding all in one : " + h1);
    }
}
