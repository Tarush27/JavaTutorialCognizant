package dsa.stack;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> s1 = new java.util.Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        s1.insertElementAt(6,4);
        System.out.println(s1);
        s1.insertElementAt(7,2);
        System.out.println(s1);
        s1.removeElement(7);
        System.out.println(s1);
    }
}
