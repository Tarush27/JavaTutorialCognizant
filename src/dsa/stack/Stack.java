package dsa.stack;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> s1 = new java.util.Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            int v = sc.nextInt();
            s1.push(v);
        }
        System.out.println(s1);
    }
}
