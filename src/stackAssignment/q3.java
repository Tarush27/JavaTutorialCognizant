package stackAssignment;

import java.util.Stack;

/*

The stack of integers {41,8} undergoes the following operations,
in the following order: "pop", "push 2", "push 15", "pop".
What does the stack look like after all of these operations have been performed?
Assume the left-most element is the top element of the stack.

Answer: {2,8}

*/
public class q3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(41);
        stack.push(8);
        System.out.println(stack + " ");
        stack.removeElementAt(0);
        System.out.println(stack + " ");
        stack.insertElementAt(2, 0);
        System.out.println(stack + " ");
        stack.insertElementAt(15, 0);
        System.out.println(stack + " ");
        stack.removeElementAt(0);
        System.out.println(stack + " ");
    }
}
