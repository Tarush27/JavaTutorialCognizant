/*

Will the following class compile? If not, why?
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}

Answer: No. The greater than (>) operator applies only to primitive numeric types.

*/