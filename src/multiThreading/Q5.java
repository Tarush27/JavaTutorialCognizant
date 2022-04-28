package multiThreading;

//5.Can we call the start method more than once on the same thread object?If yes/no explain with a programming example.

public class Q5 extends Thread
{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Run: " + i);
        }
    }
    public static void main(String[] args){
        Q5 mt = new Q5();
        mt.start();
        mt.start();
        mt.run();
    }
}
