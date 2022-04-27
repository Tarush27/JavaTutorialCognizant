package dsa;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l1 = new java.util.LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);
        l1.add(1,6);
        System.out.println(l1);
        l1.add(3,7);
        System.out.println(l1);
    }
}
