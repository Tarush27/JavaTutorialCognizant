package generics;

import java.util.Arrays;

class Swap {

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        swap(a,1,2);
        System.out.println(Arrays.toString(a));
    }
}