package multiThreading;

//1.Can we call the run method directly from the Main method?Show it with a programming example.
class TestingThread extends Thread {
    public void run() {
        System.out.println("thread started.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        TestingThread t = new TestingThread();
        t.run();
    }
}
