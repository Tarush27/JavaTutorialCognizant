package multiThreading;

/*3.Run this following simple program with three threads.
Initialize a variable sum = 0
Run a for loop for 10 times. i.e : for(int x = 0; x < 10; x++) . Add the value x to the value sum in each iteration
Print the thread name, and the value as follows : "Thread : A - value : 45 " in each iteration
Finally Print the sum from each thread as follows : "Thread : A - Sum : 45 "
You need to run the above code with at least three threads (name those threads as A,B,C....), and find the output.*/

class ThreadA extends Thread{
    public void run( ) {
        int sumA = 0;
        for(int x = 0; x < 10; x++)  {
            System.out.println("Thread : A - value : " + x);
            sumA+=x;
        }
        System.out.println("Thread : A - Sum : " + sumA);
    }
}

class ThreadB extends Thread{
    public void run( ) {
        int sumB = 0;
        for(int y = 0; y < 10; y++)  {
            System.out.println("Thread : B - value : " + y);
            sumB+=y;
        }
        System.out.println("Thread : B - Sum : " + sumB);
    }
}

class ThreadC extends Thread{
    public void run( ) {
        int sumC = 0;
        for(int z = 0; z < 10; z++)  {
            System.out.println("Thread : C - value : " + z);
            sumC+=z;
        }
        System.out.println("Thread : C - Sum : " + sumC);
    }
}


public class Q3 {
    public static void main(String args[]) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
    }
}