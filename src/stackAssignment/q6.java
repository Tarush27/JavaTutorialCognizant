package stackAssignment;

/*

Use the java.util.Stack class to write a ReverseStrings class
that when executed reverses a sequence of strings from standard input.

*/

import java.util.Scanner;
import java.util.Stack;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter words (separated by spaces) to reverse:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        scanner = new Scanner(userInput);

        Stack<String> stack = new Stack();

        // The "<String>" suffix to "Stack" above tells the
        // compiler that this will be a stack of String
        // objects only (no other types of objects will
        // be allowed to be pushed onto the stack). This
        // is called a "type parameter" -- more is coming
        // on these later...

        while (scanner.hasNext()) {
            stack.push(scanner.next());
        }
        scanner.close();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
