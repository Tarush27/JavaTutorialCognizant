package generics;

/*

Will the following class compile? If not, why?
public final class Algorithm {
    public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }
}

Answer: No. java: bad operand types for binary operator '>'
  first type:  T
  second type: T

*/
class q2{
 /*   public static <T> T max(T x, T y){
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(q2.max(3,2));
    }*/
}