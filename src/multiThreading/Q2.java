package multiThreading;

//2.Will the following method compile.If yes what will be the output of the following programme..
//Ans:Yes the code wil compile but we cannot predict the order in which the threads are going to execute
public class Q2 extends Thread
{
    public void run(){
        for(int i = 0;i<=50;i++){
            System.out.println("Run " + i);
        }
    }
    public static void main(String[] args){
        Q2 mt = new Q2();
        mt.run();
        mt.start();
        for(int i = 0;i<=50;i++)
        {
            System.out.println("Main " + i);
        }
    }
}