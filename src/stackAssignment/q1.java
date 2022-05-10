package stackAssignment;


import java.util.Stack;

/*
Given the stack of integers {7,5} ,
what does the stack look like after a call to "push" 8?
Assume the left-most element is the top element of the stack
*/
public class q1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(5);
        System.out.println(stack + " ");
        stack.insertElementAt(8,0);
        System.out.println(stack + " ");
    }
}
