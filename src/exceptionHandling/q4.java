package exceptionHandling;

/*
 Is there anything wrong with this exception handler as written? Will this code compile?
try {

        } catch (Exception e) {

        } catch (ArithmeticException a) {

        }
Answer: java: exception java.lang.ArithmeticException has already been caught.
        */
public class q4 {
    public static void main(String[] args) {
        q4 ob = new q4();
        try {
            int a = 1;
            int b = 0;
            int res = a/b;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        } /*catch (ArithmeticException a) {

        }*/
    }
}
