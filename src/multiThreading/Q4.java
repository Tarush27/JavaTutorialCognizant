package multiThreading;

//4. 2.Will the following method compile.If yes what will be the output of the following programme..
public class Q4 extends Thread
{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Run:  " + i);
        }
    }
    public static void main(String[] args){
        Q4 mt = new Q4();
        mt.start();
        mt.run();
        for(int i = 0;i<=5;i++)
        {
            System.out.println("Main: " + i);
        }
    }
}
