package multiThreading;

//7.Can we override the Start Method?If yes/no explain with a programming example.
//Yes we can Override, one of the ways is by using super keyword


public class Q7 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
class MyThread extends Thread {
    @Override
    public void start() {
        System.out.println("Overriding a start() method");
        super.start();
        for(int i=1;i<=5;i++)
        {
            System.out.print(i + " ");
        }
    }
    @Override
    public void run() {
        System.out.println("run() method ");
    }
}
