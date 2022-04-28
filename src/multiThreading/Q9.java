package multiThreading;

//9.If we call the Run method from the Overriding start method then in which thread the run method is going to be executed?Explain with a programming example.
//Answer - Whenever we override start() method then our start() method will be executed just
//like a normal method call and new thread wont be created and to execute the run method, we have
//to explicitly call/invoke it
class Test extends Thread {
    public void start()
    {
        System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("Run Method");
    }
} class Q9 {
    public static void main(String[] args)
    {
        Test thread = new Test();
        thread.start();
        System.out.println("Main Method");
    }
}
