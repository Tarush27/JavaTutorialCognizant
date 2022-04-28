package multiThreading;

//10.If we call Super.Start in the above program, is custom thread is created,
//where the run method is executed,and how many times?Explain with a programming example.


class Tst extends Thread {
    public void start()
    {
        super.start();
        System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("Run Method");
    }
}
class Q10{
    public static void main(String[] args)
    {
        Tst thread = new Tst();
        thread.start();
        System.out.println("Main Method");
    }
}
