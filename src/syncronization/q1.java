package syncronization;

//Write a java program to demonstrate working of synchronized.

class q1

{

    public static void main(String args[])

    {

        printing aa=new printing();

        A threadA=new A(aa);

        B threadB=new B(aa);

        threadA.start();

        threadB.start();
    }
}
class printing{

    synchronized void print(char ch) {


        for(int i=1;i<=10;i++)

        {

            for(int j=1;j<=i;j++) {

                System.out.print(ch);
            }

            System.out.println();
        }

    }
}

class A extends Thread

{

    printing p;

    A(printing p)

    {

        this.p=p;

    }

    public void run() {

        p.print('*');

    }
}

class B extends Thread

{

    printing p;
    B(printing p)

    {

        this.p=p;

    }

    public void run()

    {

        p.print('#');

    }
}
