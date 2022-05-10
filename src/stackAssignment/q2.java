package stackAssignment;

import java.util.Stack;

/*

The stack of integers {2,9,5,8,1,3} is "popped" twice.What is the value returned by the second "pop"operation?
Assume the left-most element is the top element of the stack.
ans: 9
 */
public class q2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.insertElementAt(2, 0);
        stack.insertElementAt(9, 1);
        stack.insertElementAt(5, 2);
        stack.insertElementAt(8, 3);
        stack.insertElementAt(1, 4);
        stack.insertElementAt(3, 5);
        System.out.println(stack + " ");
        stack.removeElementAt(0);
        System.out.println(stack + " ");
        stack.removeElementAt(0);
        System.out.println(stack + " ");
    }
}
