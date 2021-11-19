package tp3.ex1;

public class Main {


// create a class that extends thread and another one that implements runnable
    // they should print 'my thread is running' when running
    // when both terminated, print 'it s over !!'
    public static class test1 extends Thread
    {      
        @Override
        public void run()
        {
            System.out.println("My thread is running");
        }

    public static void main(String[] args) {
    }

    public static class test2 implements Runnable
    {

        @Override
        public void run() {
            System.out.println("My thread is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        test1 t1= new test1();
        test2 t2=new test2();
        Thread t=new Thread(t2)

        t1.start();
        t.start();
        t1.join();
        t.join();

        System.out.println("It's over");

    }
}
