package exceptionHandling;


/*

Match each situation in the first list with an item in the second list.
A. int[] A;
A[0] = 0;
B. The JVM starts running your program, but the JVM can't find the Java platform classes. (The Java platform classes reside in classes.zip or rt.jar.)
C. A program is reading a stream and reaches the end of stream marker.
D.  Before closing the stream and after reaching the end of stream marker,
a program tries to read the stream again.
1. __error
2. __checked exception
3. __compile error
4. __no exception

Answers:
A -> 3. java: variable A might not have been initialized
B. -> 1. error
C. -> 4. (no exception)   When you read a stream, you expect there to be an end of stream marker.
You should use exceptions to catch unexpected behavior in your program.
D. -> 2. (checked exception).

*/
public class q5 {
    public static void main(String[] args) {
       /* Q5 obj = new  Q5();
        int[] A;
        A[0] = 0;*/

    }
}
