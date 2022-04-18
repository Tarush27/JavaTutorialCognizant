package generics;

/*

Will the following class compile? If not, why?
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}

Answer: No. The greater than (>) operator applies only to primitive numeric types.

*/
class q2{
    /*public static <T> T max(T x, T y){
        return x > y ? x : y;
    }*/

    public static <T extends Comparable<T>> T max(T x,T y){
        if(x.compareTo(y) > 0){
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(q2.max(3,2));
    }
}