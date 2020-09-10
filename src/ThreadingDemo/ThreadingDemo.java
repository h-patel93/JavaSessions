package ThreadingDemo;

public class ThreadingDemo {

    public static void main(String[] args) {

        A a = new A();
        a.start();
        B b = new B();
        b.start();

    }
}
class A extends Thread
{
    public void show()
    {
        for(int i=1;i<5;i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run()
    {
        show();
    }
}
class B extends Thread
{
    public void display()
    {
        for(int i=1;i<5;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run()
    {
        display();
    }
}
