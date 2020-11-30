import java.util.*;

public class LinkedVsArray {
    static LinkedList<Integer> ll = new LinkedList<>();
    static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            ll.add(i);
        }
        System.out.println("Linked list waste " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            al.add(i);
        }
        System.out.println("Array list waste " + (System.currentTimeMillis() - start) + " ms");
    }
}
