package generics;
/*

Will the following method compile? If not, why?
public static void print(List<? extends Number> list) {
    for (Number n : list)
        System.out.print(n + " ");
    System.out.println();
}
Answer: Yes.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class q7 {
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        print(intList);
    }
}