package generics;

import generics.UnaryPredicate;

import java.util.*;

class Algorithm1 {

    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate1<T> p) {

        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) {
        }
        return y;
    }
}

interface UnaryPredicate1<T> {
    public boolean test(T obj);
}

class RelativelyPrimePredicate implements UnaryPredicate1<Integer> {
    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algorithm1.gcd(x, i) != 1)
                return false;

        return c.size() > 0;
    }

    private final Collection<Integer> c;
}

class Test1 {
    public static void main(String[] args) throws Exception {

//        List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);

        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<8;i++){
            int q = sc.nextInt();
            li.add(q);
        }
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate1<Integer> p = new RelativelyPrimePredicate(c);

        int i = Algorithm1.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}