package generics;

import generics.UnaryPredicate;

import java.util.Arrays;
import java.util.Collection;

final class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}

class OddPredicate implements UnaryPredicate<Integer> {

    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}


interface UnaryPredicate<T> {
    public boolean test(T obj);
}

class Test {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}