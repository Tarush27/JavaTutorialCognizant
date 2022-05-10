package stackAssignment;


import java.util.Scanner;
import java.util.Stack;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = scanner.nextInt();

        Stack<Integer> s = new Stack<>();

        while (n > 0) {
            s.push(n % 2);
            n = n / 2;
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
