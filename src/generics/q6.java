package generics;/*

What is the following method converted to after type erasure?
public static <T extends Comparable<T>>
    int findFirstGreaterThan(T[] at, T elem) {
    // ...
}
Answer:
public static int findFirstGreaterThan(Comparable[] at, Comparable elem) {
    // ...
    }

*/

import org.jetbrains.annotations.NotNull;

public class q6 {

    public static int findFirstGreaterThan(Comparable @NotNull [] at, Comparable elem) {
        int greater = 0;
        for(Comparable item: at) {
            if(elem.compareTo(item) < 0) {
                greater = (int)item;
                return greater;
            }
        }
        return greater;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 3, 1, 6};
        int num = 5;
        int value = findFirstGreaterThan(arr, num);
        System.out.println(value);
    }

}