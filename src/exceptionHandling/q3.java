package exceptionHandling;


/*
What exception types can be caught by the following handler?
catch (Exception e){

}
Answer: It can handle any exception since Exception class is the super class of all exceptions
but catch won't work without try keyword.
*/
public class q3 {
    void divide(int a, int b) {
        int res;
        try {
            res = a / b;
            System.out.println("Result : " + res);

        } catch (Exception e) {
            System.out.println(e);
        }

        /*catch(ArithmeticException ae){
            System.out.println(ae);
        }*/
    }

    public static void main(String[] args) {
        q3 ob = new q3();
        ob.divide(1,0);
    }
}
