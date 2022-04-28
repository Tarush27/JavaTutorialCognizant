package multiThreading;

class CustomThread extends Thread {

    @Override
    public void start() {
        System.out.println("Start Method");
    }

    @Override
    public void run() {
        System.out.println("Run Method");
    }

}
class Q8{
    public static void main(String[] args) {
        CustomThread ct = new CustomThread();
        ct.start();
        System.out.println("Main Method");
    }
}
